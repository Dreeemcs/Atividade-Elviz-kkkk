import java.util.Scanner;

public class FuncionariosMatriz {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int funcionario[][] = new int[3][2];

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.print("Idade: ");
            funcionario[i][0] = Integer.parseInt(teclado.nextLine());
            System.out.print("Salário: R$ ");
            funcionario[i][1] = Integer.parseInt(teclado.nextLine());
        }

        System.out.println();
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ": " + funcionario[i][0] +
                " anos recebe R$" + funcionario[i][1]);
        }
    }
}
