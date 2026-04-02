import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ContadorRegressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o Scanner para leitura do teclado

        System.out.print("Digite um numero inteiro para iniciar o contador regressivo: ");
        int numero = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário
                                        

        // Enquanto o número for maior ou igual a zero, exibe e decrementa
        while (numero >= 0) {
            System.out.println(numero); // Exibe o número atual
            numero = numero - 1; // Diminui 1 a cada repetição do loop

        }

        System.out.println("BOOOOOOOOOOOOOOOM");
        scanner.close(); // Fecha o Scanner para liberar recursos

    }
}