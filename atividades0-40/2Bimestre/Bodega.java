import java.util.Scanner;

public class Bodega {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = teclado.nextLine();

        double total = 0;
        double valor;

        do {
            System.out.print("Valor do consumo (0 para encerrar): ");
            valor = teclado.nextDouble();

            if (valor != 0) {
                total += valor;
            }
        } while (valor != 0);

        System.out.println("Cliente: " + nome);
        System.out.printf("Total da conta: R$ %.2f%n", total);

        System.out.print("Quanto está sendo pago em dinheiro? ");
        double pago = teclado.nextDouble();
        double troco = pago - total;

        System.out.printf("Troco a devolver: R$ %.2f%n", troco);
    }
}
