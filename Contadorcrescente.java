import java.util.Scanner;

class Contadorcrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para iniciar a contagem: ");
        int numero = scanner.nextInt();
        while (true) {
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        }
    }
}