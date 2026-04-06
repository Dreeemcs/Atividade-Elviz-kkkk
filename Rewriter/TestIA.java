// Teste IA: prova chamadas à Groq API com todos os 6 modos + fallback local
public class TestIA {
    public static void main(String[] a) {
        String t = "vc tb vai pra reunião? pq eu num sei q hora é";
        System.out.println("Texto: " + t + "\n");
        // Testa IA com cada modo (fallback automático se API falhar)
        for (RewriteMode m : RewriteMode.values()) {
            long i = System.currentTimeMillis(); // marca tempo inicial
            System.out.println(m + " (" + (System.currentTimeMillis()-i) + "ms): " + RewriterFactory.createAI(m).rewrite(t));
        }
    }
}
