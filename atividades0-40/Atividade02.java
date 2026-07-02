import java.util.Scanner;
public class Atividade02 {

    static int somar(int a, int b) {

    return a + b;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Primeiro número: ");
int x = sc.nextInt();
System.out.print("Segundo número: ");
int y = sc.nextInt();
System.out.println("Soma: " + somar(x, y));
}

}