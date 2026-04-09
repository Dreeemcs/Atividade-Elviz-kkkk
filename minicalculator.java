import java.util.*; // importa uma biblioteca para ler a entrada do usuário

public class minicalculator {
    public static void main(String[] args) {
        Scanner elvizkkk = new Scanner(System.in); 
        float num1, num2;
        String operadorelvizkk;
        float resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = elvizkkk.nextFloat();

        System.out.println("digite a operação desejada: ");
        operadorelvizkk = elvizkkk.next();

        System.out.println("Digite o segundo número: ");
        num2 = elvizkkk.nextFloat();

        switch (operadorelvizkk) {
            case "+":
                resultado = num1 + num2;
                System.out.println("O resultado da calculadora elvizzkk é: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("O resultado da calculadora elvizzkk é: " + resultado);
                break;
            case "*":
                System.out.println("O resultado da calculadora elvizzkk é: " + num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da calculadora elvizzkk é: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é possivel né pai");
                }
        }
        elvizkkk.close();

    }

}
