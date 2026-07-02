import java.util.Scanner;

// Planos adotados para o exercício: A = R$ 200,00 | B = R$ 350,00 | C = R$ 500,00
// Alunos com desconto (bolsista) pagam 50% do valor do plano.
public class Mensalidade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o plano (A, B ou C): ");
        char plano = teclado.next().toUpperCase().charAt(0);
        double valor;

        if (plano == 'A') {
            valor = 200.0;
        } else if (plano == 'B') {
            valor = 350.0;
        } else if (plano == 'C') {
            valor = 500.0;
        } else {
            System.out.println("Plano inválido!");
            return;
        }

        System.out.print("É bolsista (s/n)? ");
        char bolsista = teclado.next().toLowerCase().charAt(0);

        if (bolsista == 's') {
            valor = valor * 0.5;
        }

        System.out.printf("Valor da mensalidade: R$ %.2f%n", valor);
    }
}
