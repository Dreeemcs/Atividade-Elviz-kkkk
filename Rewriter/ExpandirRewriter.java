// Expande abreviações: vc→você, tb→também, pq→porque, pra→para
public class ExpandirRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\bvc\\b", "você").replaceAll("\\btb\\b", "também").replaceAll("\\bpq\\b", "porque").replaceAll("\\bpra\\b", "para").replaceAll("\\s+", " ").trim();
    }
}
