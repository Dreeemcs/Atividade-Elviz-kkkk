import java.util.Scanner; // Importa a classe Scanner para ler a entrada do "usuário"

public class Jogo {

    private int limite;
    private int numeroSecreto;
    private Scanner scanner = new Scanner(System.in);

    public void iniciarJogo() {

        System.out.println("Bem vindo ao jogo de advinhação!");
        System.out.println("Digite o limite para o numero secreto: ");

        limite = scanner.nextInt();
        numeroSecreto = (int) (Math.random() * limite) + 1;

        System.out.println("Tente advinhar o numero secreto entre 1 e " + limite);

        while (true) {

            int palpite = scanner.nextInt();
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Você errou tente um número maior!");
            } else {
                System.out.println("Você errou tente um número menor!");
            }
        }

    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

    }
}
