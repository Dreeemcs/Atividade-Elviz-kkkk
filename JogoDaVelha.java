import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {

    private static Scanner teclado = new Scanner(System.in);
    private static Random sorteio = new Random();
    private static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {
        inicializarTabuleiro();
        int modo = escolherModo();

        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean fimDeJogo = false;

        exibirTabuleiro();
        while (!fimDeJogo && jogadas < 9) {
            if (modo == 1 || jogadorAtual == 'X') {
                jogarHumano(jogadorAtual);
            } else if (modo == 2) {
                jogarDummy(jogadorAtual);
            } else {
                jogarXpert(jogadorAtual);
            }
            jogadas++;
            exibirTabuleiro();

            if (verificarVencedor(jogadorAtual)) {
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                fimDeJogo = true;
            } else if (jogadas == 9) {
                System.out.println("Empate!");
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }

    public static void inicializarTabuleiro() {
        for (int l = 0; l < 3; l++)
            for (int c = 0; c < 3; c++)
                tabuleiro[l][c] = ' ';
    }

    public static int escolherModo() {
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1 - Dois jogadores (X e O)");
        System.out.println("2 - Contra a máquina (dummy)");
        System.out.println("3 - Contra a máquina (xpert)");
        System.out.print("Opção: ");
        return Integer.parseInt(teclado.nextLine());
    }

    public static void exibirTabuleiro() {
        System.out.println();
        for (int l = 0; l < 3; l++) {
            System.out.println(" " + tabuleiro[l][0] + " | " + tabuleiro[l][1] + " | " + tabuleiro[l][2]);
            if (l < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    public static void jogarHumano(char jogador) {
        int linha, coluna;
        do {
            System.out.print("Jogador " + jogador + " - linha (0-2): ");
            linha = Integer.parseInt(teclado.nextLine());
            System.out.print("Jogador " + jogador + " - coluna (0-2): ");
            coluna = Integer.parseInt(teclado.nextLine());
            if (!posicaoValida(linha, coluna)) System.out.println("Posição inválida ou ocupada!");
        } while (!posicaoValida(linha, coluna));
        tabuleiro[linha][coluna] = jogador;
    }

    public static void jogarDummy(char jogador) {
        int linha, coluna;
        do {
            linha = sorteio.nextInt(3);
            coluna = sorteio.nextInt(3);
        } while (!posicaoValida(linha, coluna));
        System.out.println("Máquina (" + jogador + ") jogou em [" + linha + "][" + coluna + "]");
        tabuleiro[linha][coluna] = jogador;
    }

    public static void jogarXpert(char jogador) {
        char adversario = (jogador == 'X') ? 'O' : 'X';

        int[] jogada = encontrarJogadaVencedora(jogador);
        if (jogada == null) jogada = encontrarJogadaVencedora(adversario);
        if (jogada == null && tabuleiro[1][1] == ' ') jogada = new int[]{1, 1};
        if (jogada == null) {
            int linha, coluna;
            do {
                linha = sorteio.nextInt(3);
                coluna = sorteio.nextInt(3);
            } while (!posicaoValida(linha, coluna));
            jogada = new int[]{linha, coluna};
        }

        System.out.println("Máquina (" + jogador + ") jogou em [" + jogada[0] + "][" + jogada[1] + "]");
        tabuleiro[jogada[0]][jogada[1]] = jogador;
    }

    public static int[] encontrarJogadaVencedora(char jogador) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (tabuleiro[l][c] == ' ') {
                    tabuleiro[l][c] = jogador;
                    boolean vence = verificarVencedor(jogador);
                    tabuleiro[l][c] = ' ';
                    if (vence) return new int[]{l, c};
                }
            }
        }
        return null;
    }

    public static boolean posicaoValida(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) return false;
        return tabuleiro[linha][coluna] == ' ';
    }

    public static boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }
}
