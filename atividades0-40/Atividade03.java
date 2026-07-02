import java.util.Scanner;
public class Atividade03 {

    static boolean ehPar(int numero) {
return numero % 2 == 0;
} 
public static void main(String[] args) {
    parouimpar();
}
public static void parouimpar() {
    Scanner elvizkkk = new Scanner(System.in);
    System.out.println("escreva um numero: ");
    int numero = elvizkkk.nextInt();
    if (ehPar(numero)) {
        System.out.println("O numero " + numero + " é par");
    } else {
        System.out.println("O numero " + numero + " é impar");
    }
}
}

