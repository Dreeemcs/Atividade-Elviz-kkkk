import java.util.Scanner;

public class CaixaEletronico {

    private static Scanner teclado = new Scanner(System.in);
    private static double saldo = 0;

    public static void main(String[] args) {
        char opcao;
        do {
            opcao = mostrarMenu();
            switch (opcao) {
                case 'a': efetuarDeposito(); break;
                case 'b': verSaldo(); break;
                case 'c': efetuarSaque(); break;
                case 'd': System.out.println("Até logo!"); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 'd');
    }

    public static char mostrarMenu() {
        System.out.println("\n=== BANCO BOLA ===");
        System.out.println("a - Depósito");
        System.out.println("b - Ver Saldo");
        System.out.println("c - Efetuar Saque");
        System.out.println("d - Sair");
        System.out.print("Opção: ");
        return teclado.nextLine().charAt(0);
    }

    public static void efetuarDeposito() {
        System.out.print("Valor do depósito: R$ ");
        double valor = Double.parseDouble(teclado.nextLine());
        saldo += valor;
        System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);
    }

    public static void verSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void efetuarSaque() {
        int valor;
        do {
            System.out.print("Quanto quer sacar? R$ ");
            valor = Integer.parseInt(teclado.nextLine());

            if (valor < 10 || valor > 500) {
                System.out.println("Saque fora do limite (10-500), tente novamente.");
            } else if (valor % 10 != 0) {
                System.out.println("Saque não autorizado (deve ser múltiplo de 10).");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente! Saldo: R$ " + saldo);
            } else {
                break;
            }
        } while (true);

        saldo -= valor;

        int notas100 = valor / 100; valor = valor % 100;
        int notas50  = valor / 50;  valor = valor % 50;
        int notas20  = valor / 20;  valor = valor % 20;
        int notas10  = valor / 10;

        System.out.println("Saque autorizado!");
        if (notas100 > 0) System.out.println("Notas de $100: " + notas100);
        if (notas50  > 0) System.out.println("Notas de $50: "  + notas50);
        if (notas20  > 0) System.out.println("Notas de $20: "  + notas20);
        if (notas10  > 0) System.out.println("Notas de $10: "  + notas10);
    }
}
