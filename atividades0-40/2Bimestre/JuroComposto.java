import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;

public class JuroComposto {
    private static Scanner elvizkkk = new Scanner(System.in);
    private static PrintStream video67 = new PrintStream(System.out);
    private static String aplicacao; // RDB, Cripto, CDB, Fundos, Poupança, Outro
    private static double meses;     // prazo de aplicação
    private static double juros;     // rendimento mensal (%)
    private static double capital;   // valor inicial
    private static double montante;  // quanto rendeu no prazo

    public static void main(String[] args) {
        char continuar;
        do {
            video67.println("** Programa de rendimentos **");

            aplicacao = escolherAplicacao();
            video67.println("Você escolheu: " + aplicacao);

            setValoresRendimento();
            getMontanteMensal();

            video67.println("Obrigado por escolher o banco Bola!");

            video67.println("Deseja fazer outra simulação? (s/n)");
            continuar = elvizkkk.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        video67.println("Encerrando o programa...");
    }

    public static String escolherAplicacao() {
        String minhaAplicacao;
        video67.println("Qual aplicação deseja?");
        video67.println("a.CDB\nb.RDB\nc.Cripto\nd.Fundos\ne.Poupança\nf.Outro (informar juros manualmente)");
        video67.println("Informe sua opção:");

        switch (elvizkkk.next().charAt(0)) {
            case 'a': minhaAplicacao = "CDB"; break;
            case 'b': minhaAplicacao = "RDB"; break;
            case 'c': minhaAplicacao = "CRIPTO"; break;
            case 'd': minhaAplicacao = "FUNDOS"; break;
            case 'e': minhaAplicacao = "POUPANCA"; break;
            default:  minhaAplicacao = "OUTRO";
        }
        return minhaAplicacao;
    }

    public static void setValoresRendimento() {
        switch (aplicacao) {
            case "CDB":      juros = 1.2; break;
            case "RDB":      juros = 0.83; break;
            case "FUNDOS":   juros = 0.8; break;
            case "POUPANCA": juros = 0.5; break;
            case "CRIPTO":   juros = 2 + Math.random() * 6; break;
            default:
                video67.println("Informe a taxa de juros ao mês (%):");
                juros = elvizkkk.nextDouble();
        }

        video67.printf("Taxa de juros ao mês: %.2f%%\n", juros);

        video67.println("Informe o capital inicial (R$):");
        capital = elvizkkk.nextDouble();

        video67.println("Informe o número de meses de aplicação:");
        meses = elvizkkk.nextDouble();
    }

    public static void getMontanteMensal() {
        int mesAtual;
        double resultado = capital;

        video67.println("Evolução mensal do capital:");
        for (mesAtual = 1; mesAtual <= meses; mesAtual = mesAtual + 1) {
            resultado = resultado + (resultado * (juros / 100));
            video67.print("Mês " + mesAtual);
            video67.printf(": R$ %.2f \n", resultado);
        }

        montante = resultado;
        video67.printf("Montante final ao fim de %.0f meses: R$ %.2f \n", meses, montante);
    }
}
