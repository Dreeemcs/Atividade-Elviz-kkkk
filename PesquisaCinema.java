import java.util.Scanner;

public class PesquisaCinema {

    private static Scanner elvizkkkScanner = new Scanner(System.in);
    private static int totalRegular = 0;
    private static int totalOtimo = 0;
    private static int totalBom = 0;
    private static double somaBom = 0;
    private static int totalEspectadores = 0;

    public static void main(String[] args) {
        coletarDados();
        exibirResultados();
    }

    public static void coletarDados() {
        int idade;
        int opiniao;
        String continuar;

        do {
            totalEspectadores++;
            System.out.println("\n--- Espectador #" + totalEspectadores + " ---");

            System.out.print("Idade: ");
            idade = Integer.parseInt(elvizkkkScanner.nextLine());

            System.out.println("Opinião sobre o filme:");
            System.out.println("1 - Regular");
            System.out.println("2 - Bom");
            System.out.println("3 - Ótimo");
            System.out.print("Escolha: ");
            opiniao = Integer.parseInt(elvizkkkScanner.nextLine());

            if (opiniao == 1) {
                totalRegular++;
            } else if (opiniao == 2) {
                totalBom++;
                somaBom += idade;
            } else if (opiniao == 3) {
                totalOtimo++;
            }

            if (totalEspectadores >= 15) {
                System.out.print("Continuar pesquisa? (s/n): ");
                continuar = elvizkkkScanner.nextLine();
                if (continuar.equalsIgnoreCase("n")) {
                    break;
                }
            } else {
                continuar = "s";
            }
        } while (!continuar.equalsIgnoreCase("n"));
    }

    public static void exibirResultados() {
        System.out.println("\n===== RESULTADOS DA PESQUISA =====");
        System.out.println("Total de espectadores: " + totalEspectadores);

        System.out.println("Responderam Regular: " + totalRegular);

        if (totalBom > 0) {
            double mediaBom = somaBom / totalBom;
            System.out.printf("Média de idade (Bom): %.1f anos%n", mediaBom);
        } else {
            System.out.println("Média de idade (Bom): nenhum respondeu bom");
        }

        double percOtimo = (double) totalOtimo / totalEspectadores * 100;
        System.out.printf("Percentagem Ótimo: %.1f%%%n", percOtimo);
    }
}
