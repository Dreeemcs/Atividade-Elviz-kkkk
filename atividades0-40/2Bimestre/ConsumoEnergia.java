import java.util.Scanner;

// Faixas de consumo (kWh) e valor do kWh adotados para o exercício:
// até 100 kWh: R$ 0,50/kWh | 101 a 300 kWh: R$ 0,65/kWh | acima de 300 kWh: R$ 0,85/kWh
public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o consumo de energia do mês (kWh): ");
        double consumo = teclado.nextDouble();
        double valorKwh;

        if (consumo <= 100) {
            valorKwh = 0.50;
        } else if (consumo <= 300) {
            valorKwh = 0.65;
        } else {
            valorKwh = 0.85;
        }

        double total = consumo * valorKwh;
        System.out.printf("Valor do kWh: R$ %.2f%n", valorKwh);
        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}
