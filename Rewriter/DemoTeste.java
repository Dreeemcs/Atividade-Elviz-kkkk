// Demo: 4 textos diferentes × 6 modos de reescrita (local)
public class DemoTeste {
    public static void main(String[] args) {
        // 4 frases teste com diferentes características
        String[] textos = {
            "vc tb vai pra reunião? pq eu num sei q hora é",
            "olá ai tudo bem??",
            "num entendi nada disso",
            "tb acho pq isso é importante"
        };
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   DEMO - REESCRITOR         ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Prova cada texto com cada modo
        for (String texto : textos) {
            System.out.println("📝 " + texto);
            for (RewriteMode modo : RewriteMode.values()) {
                System.out.println("  " + modo + ": " + RewriterFactory.create(modo).rewrite(texto));
            }
            System.out.println();
        }
    }
}
