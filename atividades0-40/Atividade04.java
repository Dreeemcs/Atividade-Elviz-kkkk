import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        Scanner elvizkkk = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        int a = elvizkkk.nextInt();
        System.out.print("Digite outro número: ");
        int b = elvizkkk.nextInt();
        System.out.println("O maior número é: " + maior(a, b));
    }

    static int maior(int a, int b) {
        return (a > b) ? a : b;
    }
}