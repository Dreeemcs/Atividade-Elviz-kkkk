import java.util.Scanner;

public class CadastroIdades {

    private static Scanner elvizkkk = new Scanner(System.in);
    private static int[] idades = new int[5];

    public static void main(String[] args) {
        coletarIdades();
        exibirResultados();
    }

    public static void coletarIdades() {
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = Integer.parseInt(elvizkkk.nextLine());
        }
    }

    public static void exibirResultados() {
        int maisNovo = idades[0];
        int maisVelho = idades[0];

        for (int idade : idades) {
            if (idade < maisNovo) maisNovo = idade;
            if (idade > maisVelho) maisVelho = idade;
        }

        System.out.println("\nIdade do mais novo: " + maisNovo);
        System.out.println("Idade do mais velho: " + maisVelho);

        System.out.print("Idades na sequência inversa: ");
        for (int i = idades.length - 1; i >= 0; i--) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
    }
}
