// Main.java - Classe de entrada da calculadora
// Responsável por:
// 1. Ler entrada do usuário (número operador número)
// 2. Validar formato com regex
// 3. Executar cálculos via calculadora
// 4. Exibir histórico
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner entrada = new Scanner(System.in);

        // Regex que valida formato: "número operador número"
        // Aceita: espaços, números negativos, vírgula ou ponto como separador decimal
        // Operadores: + - * / x X ÷
        Pattern padrao = Pattern.compile("^\\s*([+-]?\\d+(?:[\\.,]\\d+)?)\\s*([+\\-*/xX÷])\\s*([+-]?\\d+(?:[\\.,]\\d+)?)\\s*$");

        // INSTRUÇÕES PARA O USUÁRIO
        System.out.println("Calculadora Simples");
        System.out.println("Digite tudo de uma vez no formato: número operador número");
        System.out.println("Exemplos: 5 + 3 | 10*2 | 7,5 ÷ 2");
        System.out.println("Digite 'sair' para encerrar e ver o histórico.\n");

        // LOOP PRINCIPAL - Lê operações até o usuário digitar "sair"
        while (true) {
            System.out.print("> ");
            String linha = entrada.nextLine();

            // Verifica se usuário quer encerrar
            if ("sair".equalsIgnoreCase(linha.trim())) {
                break;
            }

            // Valida se entrada segue o padrão esperado
            Matcher matcher = padrao.matcher(linha);
            if (!matcher.matches()) {
                System.out.println("Formato inválido. Use: número operador número");
                continue;
            }

            try {
                // Extrai os três grupos do regex: número1, operador, número2
                // Replace converte vírgula em ponto para Double.parseDouble
                double a = Double.parseDouble(matcher.group(1).replace(',', '.'));
                String operador = matcher.group(2);
                double b = Double.parseDouble(matcher.group(3).replace(',', '.'));

                // Normaliza "x" ou "X" para "*" (multiplicação)
                if ("x".equalsIgnoreCase(operador)) {
                    operador = "*";
                }

                // Executa o cálculo
                double resultado = calc.calcular(a, b, operador);
                System.out.println("Resultado: " + resultado);
            } catch (IllegalArgumentException e) {
                // Captura erros como divisão por zero
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Ao sair, exibe o histórico de todas as operações realizadas
        System.out.println("\nHistórico das operações:");
        calc.exibirHistorico();
        entrada.close(); // Fecha o Scanner para liberar recursos
    }
}