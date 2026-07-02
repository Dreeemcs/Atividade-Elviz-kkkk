import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioCorreto = "devjava";
        String palavra;

        do {
            System.out.print("Digite seu usuário de acesso de 6 letras: ");
            palavra = teclado.nextLine();

            if (!palavra.equals(usuarioCorreto)) {
                System.out.println("usuário Invalido!");

                int tamanho = palavra.length();
                if (tamanho > 6) {
                    System.out.println("Sobraram letras");
                } else if (tamanho < 6) {
                    System.out.println("Faltaram letras");
                }
                System.out.println("Tente outra vez");
            }
        } while (!palavra.equals(usuarioCorreto));

        System.out.println("Bem vindo devjava! Bora codar JAVA");
    }
}
