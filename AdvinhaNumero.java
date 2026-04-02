import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretinho = 7;
        int chute = 0; // Variável que guarda o palpite do usuário

        // Enquanto o usuário não adivinhar o número secreto, o loop continua
        while (chute != secretinho) {
            System.out.print("tente advinhar o numeor secretinho'Usuário':");
            chute = scanner.nextInt();

            // Se o palpite for menor que o número secreto, avisa para tentar um valor maior
            if (chute < secretinho) {
                System.out.println("O numero secretinho é maior que" + chute);
            }
            // Se o palpite for maior que o número secreto, avisa para tentar um valor menor
            else if (chute > secretinho) {
                System.out.println("O numero secretinho é menor que" + chute);

            }
        }
        System.out.println("PARABÉNS VOCÊ ADVINHOU O NUMERO SECRETINHO");
        scanner.close(); // Fecha o Scanner para liberar recursos

    }
}