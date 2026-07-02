// Exercícios 2 e 3: calcula a área e o perímetro de um retângulo informado pelo usuário
import java.util.Scanner;

public class Exercicio2e3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = teclado.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
    }
}
