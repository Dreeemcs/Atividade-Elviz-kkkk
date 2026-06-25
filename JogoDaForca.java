import java.util.Scanner;
import java.util.Random;

public class JogoDaForca {

    private static Scanner teclado = new Scanner(System.in);
    private static Random sorteio = new Random();
    private static String[] palavras = {
        "BANANA", "CARROS", "ESCOLA", "JANELA", "MENINO",
        "PARQUE", "SAPATO", "CADEIA", "CACHOS", "MORENA",
        "CIDADE", "BOLSAS", "CAMISA", "JANTAR", "CARTAO"
    };
    private static String[] estagiosForca = {
        "  ______\n  |    |\n  |\n  |\n  |\n__|__",
        "  ______\n  |    |\n  |    O\n  |\n  |\n__|__",
        "  ______\n  |    |\n  |    O\n  |    |\n  |\n__|__",
        "  ______\n  |    |\n  |    O\n  |   /|\n  |\n__|__",
        "  ______\n  |    |\n  |    O\n  |   /|\\\n  |\n__|__",
        "  ______\n  |    |\n  |    O\n  |   /|\\\n  |   / \\\n__|__"
    };
    private static String palavraSecreta;
    private static char[] descoberta;
    private static int vidas;

    public static void main(String[] args) {
        System.out.println("O jogo da forca MUAHAHAH!");
        char opcao;
        do {
            jogarPartida();
            System.out.print("\nJogar novamente? (s/n): ");
            opcao = teclado.nextLine().charAt(0);
        } while (opcao == 's' || opcao == 'S');
        System.out.println("Até a próxima!");
    }

    public static void jogarPartida() {
        escolherPalavra();
        vidas = 5;
        descoberta = new char[palavraSecreta.length()];
        for (int i = 0; i < descoberta.length; i++) descoberta[i] = '_';

        System.out.println("\nA palavra secreta tem " + palavraSecreta.length() + " letras.");

        while (vidas > 0 && !palavraCompleta()) {
            mostrarProgresso();
            System.out.print("Digite uma letra: ");
            char letra = Character.toUpperCase(teclado.nextLine().charAt(0));
            verificarLetra(letra);
        }

        if (palavraCompleta()) {
            System.out.println("\nParabéns! Você descobriu: " + palavraSecreta);
        } else {
            System.out.println(estagiosForca[estagiosForca.length - 1]);
            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta);
        }
    }

    public static void escolherPalavra() {
        System.out.print("Digite um número de 0 a 14 (ou -1 para sortear): ");
        int escolha = Integer.parseInt(teclado.nextLine());
        if (escolha < 0 || escolha > 14) {
            escolha = sorteio.nextInt(palavras.length);
        }
        palavraSecreta = palavras[escolha];
    }

    public static void mostrarProgresso() {
        int erros = 5 - vidas;
        System.out.println();
        System.out.println(estagiosForca[erros]);
        System.out.print("Palavra: ");
        for (char c : descoberta) System.out.print(c + " ");
        System.out.println("\nVidas restantes: " + vidas);
    }

    public static void verificarLetra(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                descoberta[i] = letra;
                acertou = true;
            }
        }
        if (acertou) {
            System.out.println("Letra '" + letra + "' encontrada!");
        } else {
            vidas--;
            System.out.println("¡Ay caramba! Letra errada. Vidas restantes: " + vidas);
        }
    }

    public static boolean palavraCompleta() {
        for (char c : descoberta) {
            if (c == '_') return false;
        }
        return true;
    }
}
