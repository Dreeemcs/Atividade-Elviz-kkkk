import java.util.Scanner;

public class Atividade08 {

    static double area(double base, double altura) {
        return base * altura;
    }

    static double perimetro(double base, double altura) {
        return 2 * base + 2 * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double b = sc.nextDouble();
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        System.out.println("Área: " + area(b, h));
        System.out.println("Perímetro: " + perimetro(b, h));
    }
}
