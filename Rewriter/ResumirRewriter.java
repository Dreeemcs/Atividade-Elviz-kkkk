// Resume removendo redundâncias: apenas, muito, realmente
public class ResumirRewriter implements Rewriter {
    @Override
    public String rewrite(String t) {
        return t.replaceAll("\\bapenás\\b", "").replaceAll("\\bmuito\\b", "").replaceAll("\\brealmente\\b", "").replaceAll("\\s+", " ").trim();
    }
}
