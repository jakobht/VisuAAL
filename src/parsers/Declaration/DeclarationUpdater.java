package parsers.Declaration;

import Model.CVar;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import parsers.Declaration.ANTLRGenerated.uppaalBaseListener;
import parsers.Declaration.ANTLRGenerated.uppaalParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by lajtman on 27-02-2017.
 */
public class DeclarationUpdater extends uppaalBaseListener {

    private List<CVar> cvarsToUpdate;
    private CommonTokenStream tokStream;
    private TokenStreamRewriter rewriter;
    private String topology;
    public DeclarationUpdater(CommonTokenStream tokens, List<CVar> updatedCVars, String topology) {
        tokStream = tokens;
        rewriter = new TokenStreamRewriter(tokens);
        this.topology = topology;
        cvarsToUpdate = updatedCVars;
    }
    public DeclarationUpdater(CommonTokenStream tokens, String topology) {
        this(tokens, new ArrayList<CVar>(), topology);
    }

    public String updatedDeclaration() {
        return rewriter.getText();
    }

    private Optional<CVar> cvarToUpdate(String declName) {
        return cvarsToUpdate.stream().filter(p -> p.getName().equals(declName)).findFirst();
    }

    @Override
    public void exitDeclId(uppaalParser.DeclIdContext ctx) {
        String declName = ctx.ID().getText();
        Optional<CVar> cvar = cvarToUpdate(declName);

        if (cvar.isPresent()) {
            Token initializeToken = ctx.initialiser().getStart();
            rewriter.replace(initializeToken, cvar.get().getValue());
        }

        if (!topology.isEmpty() && declName.equals("CONFIG_connected")) {
            rewriter.replace(ctx.initialiser().getStart(), ctx.initialiser().getStop(), topology);
        }
    }

    @Override
    public void exitInstantiation(uppaalParser.InstantiationContext ctx) {
    }
}
