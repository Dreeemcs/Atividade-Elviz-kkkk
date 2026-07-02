import java.util.Scanner;

// j - Pedra | k - Papel | p - Tesoura (jogando contra o computador)
public class JoKenPoIfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[] opcoes = {'j', 'k', 'p'};

        System.out.println("Jo Ken Po! j = Pedra, k = Papel, p = Tesoura");
        System.out.print("Escolha a sua jogada (j/k/p): ");
        char jogador = teclado.next().toLowerCase().charAt(0);

        char computador = opcoes[(int) (Math.random() * 3)];

        System.out.println("Você jogou: " + jogador);
        System.out.println("Computador jogou: " + computador);

        if (jogador == computador) {
            System.out.println("Empate!");
        } else if ((jogador == 'j' && computador == 'p')
                || (jogador == 'k' && computador == 'j')
                || (jogador == 'p' && computador == 'k')) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Computador ganhou!");
        }
    }
}
