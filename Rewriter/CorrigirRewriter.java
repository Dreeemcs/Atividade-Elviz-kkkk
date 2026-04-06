// Corrige erros: vc→você, tb→também, pq→porque, q→que, num→não
public class CorrigirRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\bvc\\b", "você").replaceAll("\\btb\\b", "também").replaceAll("\\bpq\\b", "porque").replaceAll("\\bq\\b", "que").replaceAll("\\bnum\\b", "não").replaceAll("\\s+", " ").trim();
    }
}
