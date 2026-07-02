import java.util.Scanner;

public class AnalisePalavra {
	private static Scanner Elvizkkk = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Digite uma palavra: ");
		String palavra = Elvizkkk.nextLine();
		char[] letras67 = palavra.toCharArray();
		
        System.out.println("Quantidade de letras: " + letras67.length);
		System.out.println("Primeira letra: " + letras67[0]);
		System.out.println("Última letra: " + letras67[letras67.length - 1]);
		
        String invertida76 = inverter(letras67);
	    
        System.out.println("Palavra ao contrário: " + invertida76);
		
        if (SerPalindromo(palavra, invertida76)) {
			System.out.println("É um palíndromo!");
		} else {
			System.out.println("Não é um palíndromo.");
		}
	}

	public static String inverter(char[] letras) {
		char[] invertida76 = new char[letras.length];
		for (int i = 0; i < letras.length; i++) {
			invertida76[i] = letras[letras.length - 1 - i];
		}
		return new String(invertida76);
	}

	public static boolean SerPalindromo(String original, String invertida76) {
		return original.equalsIgnoreCase(invertida76);
	}
}