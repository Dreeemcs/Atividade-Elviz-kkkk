import java.util.Scanner;
// CLI interativa: menu de 6 modos de reescrita + opção de usar IA ou local
public class Main {
    private static final RewriteMode[] M = RewriteMode.values(); // Array dos 6 modos
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        boolean r = true; // running flag
        while (r) {
            // Menu: opções 1-6 (modos) + 7 (sair)
            System.out.println("\n1.CORRIGIR 2.FORMAL 3.INFORMAL 4.RESUMIR 5.EXPANDIR 6.CLARO 7.SAIR");
            String o = s.nextLine().trim(); // opcao
            if (o.equals("7")) r = false; // sair
            else if (o.matches("[1-6]")) { // escolheu modo
                System.out.print("Texto: ");
                String t = s.nextLine().trim();
                if (t.isEmpty()) continue; // ignora vazio
                System.out.print("IA (S/N)? "); // pergunta se quer usar IA
                boolean ia = s.nextLine().trim().toUpperCase().startsWith("S");
                long i = System.currentTimeMillis(); // marca tempo
                // Cria rewriter apropriado (IA ou local) e processa
                String res = (ia ? RewriterFactory.createAI(M[Integer.parseInt(o)-1]) : RewriterFactory.create(M[Integer.parseInt(o)-1])).rewrite(t);
                System.out.println("Resultado: " + res + " (" + (System.currentTimeMillis()-i) + "ms)"); // mostra resultado + tempo
            }
        }
        s.close();
    }
}
