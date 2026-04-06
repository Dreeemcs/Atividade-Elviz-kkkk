// Converte para formal: oi→Prezado(a), tá→está, pro→para o
public class FormalRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\boi\\b", "Prezado(a)").replaceAll("\\btá\\b", "está").replaceAll("\\bpro\\b", "para o").replaceAll("\\bnum\\b", "não").trim();
    }
}
