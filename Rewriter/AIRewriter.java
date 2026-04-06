// Rewriter com IA Groq + fallback automático para rewriter local se API falhar
public class AIRewriter implements Rewriter {
    private final String mode; // Modo de reescrita (CORRIGIR, FORMAL, etc)
    
    public AIRewriter(String mode) { this.mode = mode; }
    
    @Override
    public String rewrite(String text) {
        // Tenta chamar IA com prompt dinâmico
        String res = AIService.call(getPrompt(text));
        // Se IA falhar (vazio), usa rewriter local como fallback
        return !res.isEmpty() ? res.trim() : RewriterFactory.create(RewriteMode.valueOf(mode)).rewrite(text);
    }
    
    // Gera prompt contextualizado para cada modo
    private String getPrompt(String text) {
        return switch (mode) {
            case "CORRIGIR" -> "Corrija: \"" + text + "\"";
            case "FORMAL" -> "Formal: \"" + text + "\"";
            case "INFORMAL" -> "Casual: \"" + text + "\"";
            case "RESUMIR" -> "Resuma (max 50 chars): \"" + text + "\"";
            case "EXPANDIR" -> "Expanda: \"" + text + "\"";
            case "CLARO" -> "Mais claro: \"" + text + "\"";
            default -> "Reescreva: \"" + text + "\"";
        };
    }
}
