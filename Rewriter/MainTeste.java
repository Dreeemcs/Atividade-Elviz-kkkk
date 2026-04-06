// Teste unitário: prova todos os 6 rewriters (local) com 1 texto
public class MainTeste {
    public static void main(String[] a) {
        String t = "vc tb vai pra reunião? pq eu num sei q hora é"; // texto teste
        System.out.println("Original: " + t + "\n");
        // Loop todos os 6 modos e mostra transformado
        for (RewriteMode m : RewriteMode.values()) System.out.println(m + ": " + RewriterFactory.create(m).rewrite(t));
    }
}
