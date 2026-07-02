import java.util.Scanner;

// j - Pedra | k - Papel | p - Tesoura (jogando contra o computador, várias jogadas com placar)
public class JoKenPoSwitchPlacar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] opcoes = {'j', 'k', 'p'};
        int vitorias = 0, derrotas = 0, empates = 0;
        char jogarNovamente;

        System.out.println("Jo Ken Po! j = Pedra, k = Papel, p = Tesoura");

        do {
            System.out.print("Escolha a sua jogada (j/k/p): ");
            char jogador = teclado.next().toLowerCase().charAt(0);
            char computador = opcoes[(int) (Math.random() * 3)];

            System.out.println("Você jogou: " + jogador);
            System.out.println("Computador jogou: " + computador);

            switch (jogador) {
                case 'j':
                    if (computador == 'j') {
                        System.out.println("Empate!");
                        empates++;
                    } else if (computador == 'p') {
                        System.out.println("Você ganhou!");
                        vitorias++;
                    } else {
                        System.out.println("Computador ganhou!");
                        derrotas++;
                    }
                    break;
                case 'k':
                    if (computador == 'k') {
                        System.out.println("Empate!");
                        empates++;
                    } else if (computador == 'j') {
                        System.out.println("Você ganhou!");
                        vitorias++;
                    } else {
                        System.out.println("Computador ganhou!");
                        derrotas++;
                    }
                    break;
                case 'p':
                    if (computador == 'p') {
                        System.out.println("Empate!");
                        empates++;
                    } else if (computador == 'k') {
                        System.out.println("Você ganhou!");
                        vitorias++;
                    } else {
                        System.out.println("Computador ganhou!");
                        derrotas++;
                    }
                    break;
                default:
                    System.out.println("Jogada inválida!");
            }

            System.out.println("Placar -> Vitórias: " + vitorias
                    + " | Derrotas: " + derrotas + " | Empates: " + empates);

            System.out.print("Jogar novamente? (s/n): ");
            jogarNovamente = teclado.next().toLowerCase().charAt(0);
        } while (jogarNovamente == 's');

        System.out.println("Placar final -> Vitórias: " + vitorias
                + " | Derrotas: " + derrotas + " | Empates: " + empates);
    }
}
