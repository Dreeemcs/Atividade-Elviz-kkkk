// Bônus (Desafio "Caixa Eletrônico" citado no material de apoio da lista Senha/Porta/Bodega)
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Quanto quer sacar? ");
            valor = teclado.nextInt();

            if (valor < 10 || valor > 500) {
                System.out.println("Saque fora do limite, tente novamente");
            } else if (valor % 10 != 0) {
                System.out.println("Saque não autorizado, tente novamente");
            }
        } while (valor < 10 || valor > 500 || valor % 10 != 0);

        System.out.println("Saque autorizado!");

        int restante = valor;
        int notas100 = restante / 100;
        restante %= 100;
        int notas50 = restante / 50;
        restante %= 50;
        int notas20 = restante / 20;
        restante %= 20;
        int notas10 = restante / 10;

        if (notas100 > 0) System.out.println("Notas de $100: " + notas100);
        if (notas50 > 0) System.out.println("Notas de $50: " + notas50);
        if (notas20 > 0) System.out.println("Notas de $20: " + notas20);
        if (notas10 > 0) System.out.println("Notas de $10: " + notas10);
    }
}
