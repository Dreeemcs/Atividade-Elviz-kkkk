import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int secreto = 7;
        int chute;

        System.out.println("Adivinhe o número secreto!");
        do {
            System.out.print("Digite um número: ");
            chute = teclado.nextInt();

            if (chute < secreto) {
                System.out.println("Muito baixo!");
            } else if (chute > secreto) {
                System.out.println("Muito alto!");
            }
        } while (chute != secreto);

        System.out.println("Acertou!");
    }
}
