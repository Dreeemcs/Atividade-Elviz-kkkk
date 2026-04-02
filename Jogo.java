import java.util.Scanner; // Importa a classe Scanner para ler a entrada do "usuário"

// A classe Jogo é responsável por implementar um jogo de adivinhação onde o "usuário" deve tentar adivinhar um número secreto gerado aleatoriamente dentro de um limite definido pelo "usuário"
public class Jogo {
    // Declaração de variáveis para armazenar o limite do número secreto, o número secreto em si e um objeto Scanner para ler a entrada do "usuário"
    private int limite;
    private int numeroSecreto;
    private Scanner scanner = new Scanner(System.in);

    // O método iniciarJogo é responsável por iniciar o jogo, solicitar o limite para o número secreto, gerar o número secreto e permitir que o "usuário" faça palpites até acertar o número secreto
    public void iniciarJogo() {

        System.out.println("Bem vindo ao jogo de advinhação!");
        System.out.println("Digite o limite para o numero secreto: ");

        limite = scanner.nextInt(); // Lê o limite digitado pelo "usuário" e armazena na variável "limite"
        numeroSecreto = (int) (Math.random() * limite) + 1; // Gera um número secreto aleatório entre 1 e o limite definido pelo "usuário" e armazena na variável "numeroSecreto"

        System.out.println("Tente advinhar o numero secreto entre 1 e " + limite);

        //ENQUANTO o usuário não acertar o número secreto, o loop continuará solicitando palpites e fornecendo feedback sobre se o palpite é maior ou menor que o número secreto
        while (true) {
            // Lê o palpite digitado pelo "usuário" e armazena na variável "palpite"
            int palpite = scanner.nextInt();
            // Verifica se o palpite é igual ao número secreto, se for, exibe uma mensagem de parabéns e sai do loop. Se o palpite for menor que o número secreto, exibe uma mensagem indicando que o palpite é muito baixo. Se o palpite for maior que o número secreto, exibe uma mensagem indicando que o palpite é muito alto.
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break; // Sai do loop quando o "usuário" acerta o número secreto
            } 
            // Se o palpite for menor que o número secreto, exibe uma mensagem indicando que o palpite é muito baixo. Se o palpite for maior que o número secreto, exibe uma mensagem indicando que o palpite é muito alto.
            else if (palpite < numeroSecreto) {
                System.out.println("Você errou tente um número maior!");
            } else {
                System.out.println("Você errou tente um número menor!");
                
            }
        }

    }

    // O método main é o ponto de entrada do programa, onde um objeto da classe Jogo é criado e o método iniciarJogo é chamado para iniciar o jogo de adivinhação
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

    }
}
