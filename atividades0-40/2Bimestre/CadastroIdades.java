import java.util.Scanner;

// Exercício 3 dos slides de Vetores: Cadastro de Idades
public class CadastroIdades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = teclado.nextInt();
        }

        System.out.println("Idades cadastradas:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        int maisNovo = idades[0];
        int maisVelho = idades[0];
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] < maisNovo) maisNovo = idades[i];
            if (idades[i] > maisVelho) maisVelho = idades[i];
        }

        System.out.println("Idade do mais novo: " + maisNovo);
        System.out.println("Idade do mais velho: " + maisVelho);

        System.out.println("Idades na sequência inversa:");
        for (int i = idades.length - 1; i >= 0; i--) {
            System.out.println(idades[i]);
        }
    }
}
