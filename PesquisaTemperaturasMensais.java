import java.util.Scanner;

public class PesquisaTemperaturasMensais {

    private static Scanner teclado = new Scanner(System.in);
    private static double[] temperaturas = new double[12];
    private static String[] nomesMeses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public static void main(String[] args) {
        coletarDados();
        calcularEExibir();
    }

    public static void coletarDados() {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura média de " + nomesMeses[i] + ": ");
            temperaturas[i] = Double.parseDouble(teclado.nextLine());
        }
    }

    public static void calcularEExibir() {
        double soma = 0;
        int indiceMaisQuente = 0;
        int indiceMaisFrio = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
            if (temperaturas[i] > temperaturas[indiceMaisQuente]) indiceMaisQuente = i;
            if (temperaturas[i] < temperaturas[indiceMaisFrio]) indiceMaisFrio = i;
        }

        double media = soma / temperaturas.length;

        int acimaDaMedia = 0;
        for (double t : temperaturas) {
            if (t > media) acimaDaMedia++;
        }

        System.out.printf("%nTemperatura média: %.1f%n", media);
        System.out.println("Mês mais quente: " + (indiceMaisQuente + 1) +
            " (" + nomesMeses[indiceMaisQuente] + ")");
        System.out.println("Mês mais frio: " + (indiceMaisFrio + 1) +
            " (" + nomesMeses[indiceMaisFrio] + ")");
        System.out.println("Meses acima da média: " + acimaDaMedia);
    }
}
