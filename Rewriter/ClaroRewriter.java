// Melhora clareza: combina correções + expansão
public class ClaroRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\bvc\\b", "você").replaceAll("\\btb\\b", "também").replaceAll("\\bpq\\b", "porque").replaceAll("\\bq\\b", "que").replaceAll("\\bnum\\b", "não").replaceAll("\\bpra\\b", "para").replaceAll("\\s+", " ").trim();
    }
}
