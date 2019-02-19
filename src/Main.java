import Helpers.UPPAALExecutor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Get matrix for connected graph square topology. Input nr of nodes
        //String s = Helpers.ConnectedGraphGenerator.matrix_exp6(1000);

        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        System.setProperty("swing.jlf.contentPaneTransparent", "true");

        Parent root = FXMLLoader.load(getClass().getResource("View/MainWindow.fxml"));
        Scene scene = new Scene(root, 900, 650);
        scene.getStylesheets().add(getClass().getResource("textfield-error.css").toExternalForm());

        primaryStage.setTitle("VisuAAL");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResourceAsStream("icon/icon.png")));
    }

    @Override
    public void stop() throws Exception {
        UPPAALExecutor.cancelProcesses();
        super.stop();
    }
}
