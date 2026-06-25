import java.util.Scanner;

public class jogodaVelha {

    public static void main(String[] args) {
        Scanner elvizkkk = new Scanner(System.in);

        char[][] jogo = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = ' ';
            }
        }

        char jogadorAtual = 'X';
        char vencedor = ' ';
        int jogadas = 0;

        while (vencedor == ' ' && jogadas < 9) {
            exibirTabuleiro67(jogo);
            System.out.println("Vez do jogador " + jogadorAtual);

            int linha, coluna;
            do {
                System.out.println("Digite a linha (0-2):");
                linha = elvizkkk.nextInt();
                System.out.println("Digite a coluna (0-2):");
                coluna = elvizkkk.nextInt();
            } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || jogo[linha][coluna] != ' ');

            jogo[linha][coluna] = jogadorAtual;
            jogadas++;
            vencedor = verificarVencedor67(jogo);
            if (vencedor == ' ') {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        exibirTabuleiro67(jogo);
        System.out.println("Vencedor: " + vencedor);

        elvizkkk.close();
    }

    static void exibirTabuleiro67(char[][] jogo) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char verificarVencedor67(char[][] jogo) {
        for (int i = 0; i < 3; i++) {
            if (jogo[i][0] == jogo[i][1] && jogo[i][1] == jogo[i][2]) {
                return jogo[i][0];
            }

            if (jogo[0][i] == jogo[1][i] && jogo[1][i] == jogo[2][i]) {
                return jogo[0][i];
            }
        }

        if (jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) {
            return jogo[0][0];
        }

        if (jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0]) {
            return jogo[0][2];
        }

        return ' ';
    }
}
