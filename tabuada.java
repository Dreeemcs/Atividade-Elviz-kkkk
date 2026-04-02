import java.util.Scanner; // Importa a classe Scanner para ler a entrada do "usuário"

// A classe tabuada é responsável por exibir a tabuada de um número inteiro fornecido pelo "usuário"
public class tabuada {
    // O método main é o ponto de entrada do programa
    public static void main(String[] args) { 
        Scanner scam = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do "usuário"
        System.out.println("Digite um número para ver a tabuada:"); // Solicita ao "usuário" que digite um número para exibir a tabuada
        int numero = scam.nextInt(); // Lê um número inteiro digitado pelo "usuário" e armazena na variável "numero"
        multiplicacao(numero); // Chama o método multiplicacao, passando o número digitado pelo "usuário" como argumento para exibir a tabuada correspondente
        scam.close(); // Sempre bom fechar o scanner né

    }

    // O método multiplicacao recebe um número inteiro e exibe a tabuada desse número de 0 a 10
    public static void multiplicacao(int numero) {
        for (int i = 0; i <= 10; i++) { // Loop que itera de 0 a 10 para calcular e exibir a tabuada do número fornecido
            int resultado = numero * i; // Calcula o resultado da multiplicação do número pelo índice "i"
            System.out.println(numero + " x " + i + " = " + resultado); // Exibe a multiplicação e o resultado no formato "numero x i = resultado"

        }
    }

}
