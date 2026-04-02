import java.util.Scanner; // Importa a classe Scanner pra ler a entrada do "usuário"

// A classe validacao é responsável por validar a idade do "usuário" e permitir o acesso apenas se a idade for entre 0 e 10 anos
public class validacao {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do "usuário"
        Scanner scanner = new Scanner(System.in);

        // Loop infinito para continuar pedindo a idade até que seja válida
        while (true) {
            System.out.print("Digite sua idade entre 1 e 18: ");
            int numero = scanner.nextInt(); // Lê a idade digitada pelo "usuário" e armazena na variável numero

            // Chama o método validarNumero para verificar se a idade é válida
            if (validarNumero(numero)) {
                System.out.println("idade aprovada, seja bem vindo");
                break; // Se a idade for válida, sai do loop 
            } else // Se a idade for inválida, exibe uma mensagem de erro e continua o loop para pedir a idade novamente
            {
                System.out.println("Ops a idade é incompativel, tente novamente");

            }

        }

    }
    // O método validarNumero recebe um número inteiro como parâmetro e retorna true se o número for maior ou igual a 0 e menor ou igual a 10, caso contrário retorna false
    public static boolean validarNumero(int numero) {
        // Verifica se o número é maior ou igual a 0 e menor ou igual a 10
        if (numero > 0 && numero <= 18) {
            return true;
        } else {
            return false;
        }
    }
}
