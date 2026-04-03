
import java.util.Scanner;

public class mediadeduasnotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble(); // Lê a primeira nota do usuário
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble(); // Lê a segunda nota do usuário
        double media = calcularMedia(nota1, nota2); // Chama o método para calcular a média
        System.out.println("A média das notas é: " + media); // Exibe a média calculada
        scanner.close();
        classificacao(media);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void classificacao(double media) {
        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
         } else if (media >= 5) {
            System.out.println("O aluno está em recuperação.");
         } else {
            System.out.println("O aluno está reprovado.");
         }
    }
}
