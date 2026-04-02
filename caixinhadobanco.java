import java.util.Scanner; // Importa o scanner para ler o que o 'Usuário' digitar no teclado


public class caixinhadobanco {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do "usuário"

        double meta = 1000.00; // Meta de saldo que o 'Usuário' quer atingir
        double saldo = 0.00; // Saldo inicial do 'Usuário'

        //ENQUANTO o saldo for menor que a meta
        while (saldo < meta) {
            double falta = meta - saldo; // Calcula quanto falta pra atingir a meta
            System.out.println("Faltam R$ " + falta + " para bater a meta.");
            System.out.print("Valor do deposito: ");
            double deposito = scanner.nextDouble();
            // SE o deposito for maior que 0, adiciona o saldo, caso contrário vai dar erro
            if (deposito > 0) {
                saldo += deposito;
                System.out.println("Saldo atual: R$ " + saldo);
            } 
            //SE O IF for falso, se o depositofor menor ou igual a 0 DA ERRO
            else {
                System.out.println("Deposito invalido! Digite um valor maior que 0.");
            }
        }

        System.out.println("Parabens! Meta atingida. Saldo final: R$ " + saldo);
        scanner.close(); // Sempre bom fechar o Scanner né
    }
}