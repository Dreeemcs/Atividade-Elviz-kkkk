import java.util.Scanner;

public class FinanciamentoCarro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double carro, valorP, PF;
        int[] parcelas = {12, 24, 36, 48, 60};
        int[] percentuais = {6, 12, 18, 24, 30};

        System.out.print("Insira o valor do carro: ");
        carro = Double.parseDouble(teclado.nextLine());

        System.out.printf("Valor a vista: R$%.2f%n", carro * 0.80);
        System.out.println("Valor financiado e parcelas:");
        System.out.printf("%-15s %-15s %-15s%n", "Meses", "Valor R$", "Valor Final");

        for (int i = 0; i < parcelas.length; i++) {
            PF = carro * (1 + percentuais[i] / 100.0);
            valorP = PF / parcelas[i];
            System.out.printf("%-15d %-15.2f %-15.2f%n", parcelas[i], valorP, PF);
        }
    }
}
