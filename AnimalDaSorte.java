import java.util.Scanner;

public class AnimalDaSorte {

    public static Scanner Elvizkkk = new Scanner(System.in);

    public static void main(String[] args) {

        String[] letras = {
            "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j"
        };

        String[] animais = {
            "cavalo", "macaco", "jacaré", "coelho", "gavião",
            "coruja", "pombo", "lagarto", "camelo", "falcão"
        };

        System.out.print("Digite um número de 0 a 9: ");
        int numero = Integer.parseInt(Elvizkkk.nextLine());

        String letraSorte = letras[numero];
        System.out.println("A letra da pessoa que gosta de você é: " + letraSorte);

        String animalSorte67 = animais[numero];
        System.out.println("O animal da sorte de hoje é: " + animalSorte67);
        System.out.println("3ª letra da palavra: " + animalSorte67.charAt(2));
    }
}
