import java.util.Scanner;

public class FuncionarioIdadeSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int funcionario[][] = new int[3][2];

        for (int i = 0; i < funcionario.length; i++) {
            System.out.print("Idade do funcionário " + (i + 1) + ": ");
            funcionario[i][0] = teclado.nextInt();
            System.out.print("Salário do funcionário " + (i + 1) + ": ");
            funcionario[i][1] = teclado.nextInt();
        }

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ": " + funcionario[i][0]
                    + " anos recebe R$" + funcionario[i][1]);
        }
    }
}
