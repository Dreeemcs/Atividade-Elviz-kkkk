import java.util.Scanner;

public class JogoDoPIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int pinCorreto = 4321;
        int tentativas = 0;
        final int maxTentativas = 3;
        int pinDigitado;

        System.out.println("Jogo do PIN - você tem " + maxTentativas + " tentativas.");

        do {
            System.out.print("Digite o PIN de 4 dígitos: ");
            pinDigitado = teclado.nextInt();
            tentativas++;

            if (pinDigitado == pinCorreto) {
                System.out.println("PIN correto! Acesso liberado.");
                break;
            } else if (pinDigitado < pinCorreto) {
                System.out.println("PIN incorreto. Dica: o PIN é maior.");
            } else {
                System.out.println("PIN incorreto. Dica: o PIN é menor.");
            }
        } while (tentativas < maxTentativas);

        if (pinDigitado != pinCorreto) {
            System.out.println("Número máximo de tentativas atingido. Acesso bloqueado!");
        }
    }
}
