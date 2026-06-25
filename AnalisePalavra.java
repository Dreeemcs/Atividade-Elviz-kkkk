import java.util.Scanner;

public class AnalisePalavra {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        char[] letras = palavra.toCharArray();

        System.out.println("Quantidade de letras: " + letras.length);
        System.out.println("Primeira letra: " + letras[0]);
        System.out.println("Última letra: " + letras[letras.length - 1]);

        String invertida = inverter(letras);
        System.out.println("Palavra ao contrário: " + invertida);

        if (ehPalindromo(palavra, invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static String inverter(char[] letras) {
        char[] invertida = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            invertida[i] = letras[letras.length - 1 - i];
        }
        return new String(invertida);
    }

    public static boolean ehPalindromo(String original, String invertida) {
        return original.equalsIgnoreCase(invertida);
    }
}
