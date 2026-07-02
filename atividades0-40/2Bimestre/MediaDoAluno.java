import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.print("Digite a nota 1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a nota 2: ");
        n2 = teclado.nextDouble();
        System.out.print("Digite a nota 3: ");
        n3 = teclado.nextDouble();
        System.out.print("Digite a nota 4: ");
        n4 = teclado.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("Aprovado!");
        } else if (media >= 4) {
            System.out.println("Em recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
