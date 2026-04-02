import java.util.Scanner; // Importa a classe Scanner pra ler a entrada do "usuário"

public class ContadorRegressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do "usuário"

        System.out.print("Digite um numero inteiro para iniciar o contador regressivo: ");
        int numero = scanner.nextInt(); // Faz o java olhar para o teclado e ler um numero inteiro digitado pelo "usuário"
                                        

        // enquanto o numero for maior ou igual a zero
        while (numero >= 0) {
            System.out.println(numero); // exibe o numero atual
            numero = numero - 1; // faz diminuir 1 a cada rodada, ou seja a cada repetição do loop

        }

        System.out.println("BOOOOOOOOOOOOOOOM");
        scanner.close(); // Sempre bom fechar o Scanner né

    }
}