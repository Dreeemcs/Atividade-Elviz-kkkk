import java.util.Scanner;

public class Atividade26 {

    static double somar(double a, double b) { return a + b; }
    static double subtrair(double a, double b) { return a - b; }
    static double multiplicar(double a, double b) { return a * b; }

    static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Somar 2-Subtrair 3-Multiplicar 4-Dividir");
        int op = sc.nextInt();
        System.out.print("Número 1: ");
        double a = sc.nextDouble();
        System.out.print("Número 2: ");
        double b = sc.nextDouble();

        switch (op) {
            case 1: System.out.println("Resultado: " + somar(a, b)); break;
            case 2: System.out.println("Resultado: " + subtrair(a, b)); break;
            case 3: System.out.println("Resultado: " + multiplicar(a, b)); break;
            case 4: System.out.println("Resultado: " + dividir(a, b)); break;
            default: System.out.println("Opção inválida!");
        }
    }
}
