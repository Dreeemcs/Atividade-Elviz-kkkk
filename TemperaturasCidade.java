import java.util.Scanner;

public class TemperaturasCidade {

    private static Scanner teclado = new Scanner(System.in);
    private static String cidade;
    private static double[] temperaturas = new double[6];

    public static void main(String[] args) {
        coletarDados();
        exibirResultados();
    }

    public static void coletarDados() {
        System.out.print("Nome da cidade: ");
        cidade = teclado.nextLine();

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + " (°C): ");
            temperaturas[i] = Double.parseDouble(teclado.nextLine());
        }
    }

    public static void exibirResultados() {
        double soma = 0;
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (double t : temperaturas) {
            soma += t;
            if (t > maior) maior = t;
            if (t < menor) menor = t;
        }

        System.out.println("\n=== Histórico de Temperaturas: " + cidade + " ===");
        System.out.print("Temperaturas registradas: ");
        for (double t : temperaturas) {
            System.out.printf("%.1f ", t);
        }
        System.out.println();
        System.out.printf("Média da semana: %.2f°C%n", soma / temperaturas.length);
        System.out.printf("Maior temperatura: %.1f°C%n", maior);
        System.out.printf("Menor temperatura: %.1f°C%n", menor);
    }
}
