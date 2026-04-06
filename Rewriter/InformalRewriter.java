// Converte para informal: você→vc, também→tb, para→pra, por que→pq
public class InformalRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\bvocê\\b", "vc").replaceAll("\\btambém\\b", "tb").replaceAll("\\bpara\\b", "pra").replaceAll("\\bpor que\\b", "pq").replaceAll("\\s+", " ").trim();
    }
}
