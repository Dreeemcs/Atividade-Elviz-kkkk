
import java.util.Scanner;

public class mediadeduasnotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble(); // Lê a primeira nota do usuário
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble(); // Lê a segunda nota do usuário
        double media = (nota1 + nota2) / 2; //Calcula a média das duas notas
        System.out.println("A média das notas é: " + media); //Exibe a média calculada


    } public static void calcularMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2; //Calcula a média das duas notas
        System.out.println("A média das notas é: " + media); //Exibe a média calculada
    }
}
