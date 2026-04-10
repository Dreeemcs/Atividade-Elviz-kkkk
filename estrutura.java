import java.util.Scanner;

public class EstruturaDecisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =========================================================
        // 1. IF / ELSE SIMPLES — Verificar se número é positivo
        // =========================================================
        System.out.println("=== IF / ELSE SIMPLES ===");
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (num < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }

        // =========================================================
        // 2. IF / ELSE — Par ou Ímpar
        // =========================================================
        System.out.println("\n=== PAR OU ÍMPAR ===");
        System.out.print("Digite um inteiro: ");
        int inteiro = sc.nextInt();

        if (inteiro % 2 == 0) {
            System.out.println(inteiro + " é PAR.");
        } else {
            System.out.println(inteiro + " é ÍMPAR.");
        }

        // =========================================================
        // 3. IF ENCADEADO — Classificação de notas (0 a 10)
        // =========================================================
        System.out.println("\n=== CLASSIFICAÇÃO DE NOTA ===");
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else if (nota >= 9) {
            System.out.println("Conceito: A (Excelente)");
        } else if (nota >= 7) {
            System.out.println("Conceito: B (Bom)");
        } else if (nota >= 5) {
            System.out.println("Conceito: C (Regular)");
        } else {
            System.out.println("Conceito: D (Reprovado)");
        }

        // =========================================================
        // 4. IF ENCADEADO — Calculadora básica (4 operações)
        // =========================================================
        System.out.println("\n=== CALCULADORA BÁSICA ===");
        System.out.print("Número A: ");
        double a = sc.nextDouble();
        System.out.print("Número B: ");
        double b = sc.nextDouble();
        System.out.print("Operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Resultado: " + (a + b));
        } else if (op == '-') {
            System.out.println("Resultado: " + (a - b));
        } else if (op == '*') {
            System.out.println("Resultado: " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Erro: divisão por zero!");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Operação inválida!");
        }

        // =========================================================
        // 5. OPERADOR TERNÁRIO — Maior entre dois números
        // =========================================================
        System.out.println("\n=== TERNÁRIO — MAIOR ENTRE DOIS ===");
        System.out.print("Número X: ");
        double x = sc.nextDouble();
        System.out.print("Número Y: ");
        double y = sc.nextDouble();

        double maior = (x > y) ? x : y;
        System.out.println("O maior é: " + maior);

        // =========================================================
        // 6. OPERADOR TERNÁRIO — Desconto em compra
        // =========================================================
        System.out.println("\n=== TERNÁRIO — DESCONTO ===");
        System.out.print("Valor da compra (R$): ");
        double compra = sc.nextDouble();

        double desconto = (compra >= 100.0) ? compra * 0.10 : 0;
        double total    = compra - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total:    R$ %.2f%n", total);

        // =========================================================
        // 7. SWITCH — Dia da semana
        // =========================================================
        System.out.println("\n=== SWITCH — DIA DA SEMANA ===");
        System.out.print("Digite o número do dia (1=Seg ... 7=Dom): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Segunda-feira");  break;
            case 2: System.out.println("Terça-feira");    break;
            case 3: System.out.println("Quarta-feira");   break;
            case 4: System.out.println("Quinta-feira");   break;
            case 5: System.out.println("Sexta-feira");    break;
            case 6: System.out.println("Sábado");         break;
            case 7: System.out.println("Domingo");        break;
            default: System.out.println("Dia inválido!"); break;
        }

        // =========================================================
        // 8. SWITCH — Mês e número de dias
        // =========================================================
        System.out.println("\n=== SWITCH — DIAS NO MÊS ===");
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                System.out.println("31 dias");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println("28 ou 29 dias (verificar ano bissexto)");
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }

        // =========================================================
        // 9. IF ENCADEADO — Classificação de IMC
        // =========================================================
        System.out.println("\n=== CLASSIFICAÇÃO DE IMC ===");
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        // =========================================================
        // 10. IF COMPOSTO — Verificar triângulo e tipo
        // =========================================================
        System.out.println("\n=== TIPO DE TRIÂNGULO ===");
        System.out.print("Lado A: ");
        double la = sc.nextDouble();
        System.out.print("Lado B: ");
        double lb = sc.nextDouble();
        System.out.print("Lado C: ");
        double lc = sc.nextDouble();

        boolean valido = (la + lb > lc) && (la + lc > lb) && (lb + lc > la);

        if (!valido) {
            System.out.println("Não forma um triângulo.");
        } else if (la == lb && lb == lc) {
            System.out.println("Triângulo EQUILÁTERO");
        } else if (la == lb || lb == lc || la == lc) {
            System.out.println("Triângulo ISÓSCELES");
        } else {
            System.out.println("Triângulo ESCALENO");
        }

        sc.close();
    }
}
