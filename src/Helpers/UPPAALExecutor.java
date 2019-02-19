package Helpers;

import Model.SimulateOutput;
import exceptions.UPPAALFailedException;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TextInputControl;
import parsers.RegexHelper;
import parsers.SimulateParser;
import parsers.UPPAALParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by rasmu on 07/02/2017.
 */
public class UPPAALExecutor {
    private static boolean cancelled = false;
    private static Collection<CompletableFuture<SimulateOutput>> futures = new ConcurrentLinkedQueue<>();
    private static Collection<Process> verifytaProcesses = new ArrayList<>();
    private static SimpleBooleanProperty simulationsActive = new SimpleBooleanProperty(false);

    public static CompletableFuture<SimulateOutput> startUppaalQuery(String modelPath, String query, TextInputControl feedbackCtrl) throws IOException {
        setCancelled(false);
        simulationsActive.set(true);
        String verifytaLocation = GUIHelper.getVerifytaLocationFromUser();
        if (verifytaLocation == null)
            return null;

        String simulateCountString = RegexHelper.getFirstMatchedValueFromRegex("simulate (\\d+)", query);
        if (simulateCountString == null)
            return null;

        int simulateCount = Integer.parseInt(simulateCountString);

        File queryFile = UPPAALParser.generateQueryFile(query);

        CompletableFuture<SimulateOutput> simulateOutputCompletableFuture = CompletableFuture.supplyAsync(() -> runUppaal(modelPath, verifytaLocation, queryFile.getPath(), simulateCount, feedbackCtrl));
        futures.add(simulateOutputCompletableFuture);
        simulateOutputCompletableFuture.thenApply(p -> handleFutureDone(simulateOutputCompletableFuture));
        return simulateOutputCompletableFuture;
    }

    private static boolean handleFutureDone(CompletableFuture<SimulateOutput> sim) {
        boolean returnval = futures.remove(sim);
        simulationsActive.set(!futures.isEmpty());
        return returnval;
    }

    public static void cancelProcesses() {
        setCancelled(true);
        for (CompletableFuture<SimulateOutput> future : futures) {
            future.cancel(true);
        }
        for (Process p : verifytaProcesses) {
            p.destroy();
        }
        verifytaProcesses.clear();
        simulationsActive.set(false);
    }

    private static boolean isCancelled() {
        return cancelled;
    }

    private static void setCancelled(boolean cancelled) {
        UPPAALExecutor.cancelled = cancelled;
    }

    private static SimulateOutput runUppaal(String modelPath, String verifytaLocation, String queryFile, int simulateCount, TextInputControl feedbackCtrl) {
        {
            try {
                verifytaLocation = "/home/jakob/.SiriKali/reachi-enc-0.10/uppaal_bin/stratego_nightly_2510284831ad4e5091838eca49934cd93813736c/verifyta";
                System.err.println(verifytaLocation + " " + modelPath + " " + queryFile);
                ProcessBuilder builder = new ProcessBuilder(verifytaLocation, modelPath, queryFile);
                Map<String, String> env = builder.environment();
                env.put("LD_LIBRARY_PATH", "/home/jakob/.SiriKali/reachi-enc-0.10/uppaal_bin/stratego_nightly_66ff63f13f8aac6dd3107f175a3605d7697899ba");
                long startTime = System.currentTimeMillis();
                Process p = builder.start();
                verifytaProcesses.add(p);

                //TODO: Maybe this output should be serialized incase errors happen later.
                PrintStreamList printStreamList = new PrintStreamList();
                Thread inputStreamLoader = redirect(p.getInputStream(), printStreamList, new PrintStreamRedirector(feedbackCtrl));
                PrintStreamList printStreamListerr = new PrintStreamList();
                Thread errorStreamLoader = redirect(p.getErrorStream(), printStreamListerr, new PrintStreamRedirector(feedbackCtrl));


                p.waitFor();
                inputStreamLoader.join();
                errorStreamLoader.join();
                verifytaProcesses.remove(p);

                if (isCancelled())
                    return null;

                if (p.exitValue() > 0) {
                    System.err.println(printStreamList.getLines());
                    System.err.println(printStreamListerr.getLines());
                    throw new UPPAALFailedException();
                }

                if (printStreamList.getLines().size() == 0)
                    return null;

                long endTime = System.currentTimeMillis();
                // feedbackCtrl.setText( feedbackCtrl.getText()+"This took: "+String.valueOf(endTime-startTime)+" ms");
                return SimulateParser.parse(printStreamList.getLines(), simulateCount);

            } catch (InterruptedException | IOException e) {
                return null;
            }
        }
    }

    private static Thread redirect(final InputStream src, final PrintStream... dest) {
        Thread t = new Thread(() -> {
            Scanner sc = new Scanner(src);
            while (sc.hasNextLine() && !isCancelled()) {
                String line = sc.nextLine();
                for (PrintStream p : dest)
                    p.println(line);
            }
        });
        t.start();
        return t;

    }

    public static boolean isSimulationsActive() {
        return simulationsActive.get();
    }

    public static SimpleBooleanProperty simulationsActiveProperty() {
        return simulationsActive;
    }
}
