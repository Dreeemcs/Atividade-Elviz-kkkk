import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Exibe a tabuada de um número inteiro informado pelo usuário.
public class tabuada {
    // Ponto de entrada do programa.
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in); // Cria o Scanner para leitura do teclado
        System.out.println("Digite um número para ver a tabuada:"); // Solicita o número ao usuário
        int numero = scam.nextInt(); // Lê o número inteiro digitado
        multiplicacao(numero); // Chama o método que imprime a tabuada
        scam.close(); // Fecha o Scanner para liberar recursos
    }

    // Recebe um número inteiro e exibe sua tabuada de 0 a 10.
    public static void multiplicacao(int numero) {
        for (int i = 0; i <= 10; i++) { // Itera de 0 a 10 para montar a tabuada
            int resultado = numero * i; // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe no formato "numero x i = resultado"

        }
    }

}
