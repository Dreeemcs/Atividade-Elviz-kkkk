import java.util.Random;// Importa a classe Random para gerar números aleatórios
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Implementa um jogo de adivinhação com número secreto aleatório.
public class Jogo {
    // Armazena o limite, o número secreto e os objetos de entrada/aleatoriedade.
    private int limite;
    private int numeroSecreto;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    // Inicia o jogo, gera o número secreto e lê os palpites até o acerto.
    public void iniciarJogo() {

        System.out.println("Bem vindo ao jogo de advinhação!");
        System.out.println("Digite o limite para o numero secreto: ");

        limite = scanner.nextInt(); // Lê o limite digitado pelo usuário
        numeroSecreto = random.nextInt(limite) + 1; // Gera um número aleatório entre 1 e o limite informado

        System.out.println("Tente advinhar o numero secreto entre 1 e " + limite);

        // Enquanto não acertar, continua pedindo palpites.
        while (true) {
            // Lê o palpite do usuário
            int palpite = scanner.nextInt();
            // Verifica se acertou; caso contrário, informa se deve tentar maior ou menor.
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break; // Sai do loop quando o usuário acerta
            }
            // Dá a dica com base no valor do palpite.
            else if (palpite < numeroSecreto) {
                System.out.println("Você errou tente um número maior!");
            } else {
                System.out.println("Você errou tente um número menor!");
            }
        }

    }

    // Ponto de entrada do programa.
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

    }
}
