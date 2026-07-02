import java.util.Scanner;

public class Atividade31 {

    static boolean ehPar(int n) { return n % 2 == 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            if (ehPar(n)) {
                System.out.println(n + " é par");
                pares++;
            } else {
                System.out.println(n + " é ímpar");
                impares++;
            }
        }
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
    }
}
