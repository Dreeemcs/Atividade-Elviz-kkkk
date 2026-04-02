import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário


public class caixinhadobanco {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o Scanner para leitura do teclado

        double meta = 1000.00; // Meta de saldo que o usuário quer atingir
        double saldo = 0.00; // Saldo inicial

        // Enquanto o saldo for menor que a meta, continua pedindo depósitos
        while (saldo < meta) {
            double falta = meta - saldo; // Calcula quanto falta para atingir a meta
            System.out.println("Faltam R$ " + falta + " para bater a meta.");
            System.out.print("Valor do deposito: ");
            double deposito = scanner.nextDouble();
            // Se o depósito for maior que 0, soma no saldo
            if (deposito > 0) {
                saldo += deposito;
                System.out.println("Saldo atual: R$ " + saldo);
            } 
            // Caso contrário, informa que o valor digitado é inválido
            else {
                System.out.println("Deposito invalido! Digite um valor maior que 0.");
            }
        }

        System.out.println("Parabens! Meta atingida. Saldo final: R$ " + saldo);
        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}