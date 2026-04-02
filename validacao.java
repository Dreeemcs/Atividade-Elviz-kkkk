import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite sua idade: ");
            int numero = scanner.nextInt();

            if (validarNumero(numero)) {
                System.out.println("idade aprovada, seja bem vindo");
                break; // para o loop infinito
            } else {
                System.out.println("Ops a idade é incompativel, tente novamente");

            }

        }

    }

    public static boolean validarNumero(int numero) {
        if (numero > -1 && numero <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
