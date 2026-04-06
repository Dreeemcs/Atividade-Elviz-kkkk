// Factory Pattern: cria rewriters locais (switch) ou com IA (Groq)
public class RewriterFactory {
    // Cria rewriter baseado no modo (sem IA)
    public static Rewriter create(RewriteMode m) {
        return switch (m) {
            case CORRIGIR -> new CorrigirRewriter();
            case FORMAL -> new FormalRewriter();
            case INFORMAL -> new InformalRewriter();
            case RESUMIR -> new ResumirRewriter();
            case EXPANDIR -> new ExpandirRewriter();
            case CLARO -> new ClaroRewriter();
        };
    }
    // Cria rewriter com IA (fallback para local se API falhar)
    public static Rewriter createAI(RewriteMode m) { return new AIRewriter(m.toString()); }
}
