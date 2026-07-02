// Obs: o AVA não trouxe o enunciado detalhado desta lista (só o título "Codigo Java 1, 4
// e 2+3"), então os 3 programas abaixo foram feitos com base no nível da aula do dia 23/04
// (estruturas de repetição e operadores). Ajuste conforme o enunciado exato passado em aula.

// Exercício 1: soma dos números de 1 até N informado pelo usuário
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = teclado.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma de 1 até " + n + " = " + soma);
    }
}
