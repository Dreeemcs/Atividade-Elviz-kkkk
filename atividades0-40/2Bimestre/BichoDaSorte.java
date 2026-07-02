import java.util.Scanner;

// Exercício 6 dos slides de Vetores: Vetor de Strings (bicho da sorte do dia)
public class BichoDaSorte {
    public static void main(String[] args) {
        String[] bichos = {
            "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro",
            "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho"
        };

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 9 para saber o bicho da sorte do dia: ");
        int numero = teclado.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("O seu bicho da sorte de hoje é: " + bichos[numero]);
        } else {
            System.out.println("Número inválido! Digite um valor entre 0 e 9.");
        }
    }
}
