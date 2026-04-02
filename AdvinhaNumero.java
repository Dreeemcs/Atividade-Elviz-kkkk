import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretinho = 7;
        int chute = 0; // var que guarda o chute do famoso "Usuário"

        // enquanto o 'usuário' não adivinhar o numero secretinho
        while (chute != secretinho) {
            System.out.print("tente advinhar o numeor secretinho'Usuário':");
            chute = scanner.nextInt();

            // se o chute for maior que o numero secretinho
            if (chute < secretinho) {
                System.out.println("O numero secretinho é maior que" + chute);
            }
            // se o chute for menor que o numero secretinho
            else if (chute > secretinho) {
                System.out.println("O numero secretinho é menor que" + chute);

            }
        }
        System.out.println("PARABÉNS VOCÊ ADVINHOU O NUMERO SECRETINHO");
        scanner.close();// Sempre bom fechar o Scanner né

    }
}