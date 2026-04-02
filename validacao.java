import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Valida uma idade informada pelo usuário.
public class validacao {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // Continua pedindo a idade até que o valor esteja no intervalo válido.
        while (true) {
            System.out.print("Digite sua idade entre 1 e 18: ");
            int numero = scanner.nextInt(); // Lê a idade digitada e armazena na variável numero

            // Chama o método de validação para verificar se a idade é válida.
            if (validarNumero(numero)) {
                System.out.println("idade aprovada, seja bem vindo");
                break; // Se a idade for válida, sai do loop
            } else // Se for inválida, informa o erro e pede a idade novamente
            {
                System.out.println("Ops a idade é incompativel, tente novamente");

            }

        }

    }

    // Retorna true quando a idade está no intervalo de 1 a 10.
    public static boolean validarNumero(int numero) {
        // Verifica se o número é maior que 0 e menor ou igual a 10.
        if (numero > 0 && numero <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
