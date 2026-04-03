
import java.util.Scanner;


    class CalculadoraTriploDuplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int triplo = CalculadoraTriploDuplo.calcularTriplo(numero);
        int duplo = CalculadoraTriploDuplo.calcularDuplo(numero);
        System.out.println("Número: " + numero);
        System.out.println("Triplo: " + triplo);
        System.out.println("Duplo: " + duplo);


        scanner.close();
      
    }

    public static int calcularTriplo(int numero) {
        return numero * 3;
    }

    public static int calcularDuplo(int numero) {
        return numero * 2;
    }
}