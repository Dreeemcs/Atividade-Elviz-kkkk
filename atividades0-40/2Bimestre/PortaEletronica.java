import java.util.Scanner;

public class PortaEletronica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.println("Abertura de porta electronica");

        do {
            System.out.print("Digite o código de acesso (4 dígitos): ");
            codigo = teclado.nextInt();

            if (codigo < 1000 || codigo > 9999) {
                System.out.println("não liberado, use 4 dígitos:");
            } else if (codigo != 1001 && codigo != 2000 && codigo != 4321) {
                System.out.println("código inválido.");
            }
        } while (codigo < 1000 || codigo > 9999
                || (codigo != 1001 && codigo != 2000 && codigo != 4321));

        System.out.println("Porta liberada! Acesso autorizado.");
    }
}
