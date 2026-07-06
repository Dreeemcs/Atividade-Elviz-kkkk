import java.util.Scanner;

public class Questao2_MansaoDaCoxinha {

    static Scanner sc = new Scanner(System.in);

    static int totalCoxinhasVendidas = 0;
    static double faturamentoTotal = 0;

    static int[] idades = new int[1000];
    static int[] notas = new int[1000];
    static int totalAvaliacoes = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            banner();
            System.out.println("1 - Fazer Pedido");
            System.out.println("2 - Avaliar Pedido");
            System.out.println("3 - Mostrar Relatório");
            System.out.println("4 - Sair");
            System.out.print("Informe sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    avaliarPedido();
                    break;
                case 3:
                    mostrarRelatorio();
                    break;
                case 4:
                    System.out.println("Encerrando sistema... Relatório final:");
                    mostrarRelatorio();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }

    public static void banner() {
        System.out.println("==========================");
        System.out.println("     MANSÃO DA COXINHA");
        System.out.println("==========================");
    }

    public static void fazerPedido() {
        System.out.print("Quantas coxinhas deseja comprar? ");
        int qtd = sc.nextInt();

        double valorUnitario = (qtd >= 50) ? 0.80 : 0.99;
        double valorTotal = qtd * valorUnitario;

        System.out.println("Deseja pagar no PIX?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int pagamento = sc.nextInt();

        double desconto = 0;
        if (pagamento == 1) {
            desconto = valorTotal * 0.05;
            valorTotal -= desconto;
        }

        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println("Quantidade de coxinhas: " + qtd);
        System.out.printf("Valor unitário aplicado: R$ %.2f%n", valorUnitario);
        System.out.printf("Desconto recebido: R$ %.2f%n", desconto);
        System.out.printf("Valor final do pedido: R$ %.2f%n", valorTotal);
        System.out.println("------------------------\n");

        totalCoxinhasVendidas += qtd;
        faturamentoTotal += valorTotal;
    }

    public static void avaliarPedido() {
        int idade;
        do {
            System.out.print("Informe sua idade: ");
            idade = sc.nextInt();
            if (idade <= 16) {
                System.out.println("Idade inválida. Informe idade maior que 16 anos.");
            }
        } while (idade <= 16);

        int nota;
        do {
            System.out.println("Dê uma nota de 1 a 5:");
            System.out.println("5 = Ótimo | 4 = Bom | 3 = Regular | 2 = Ruim | 1 = Péssimo");
            System.out.print("Nota: ");
            nota = sc.nextInt();
            if (nota < 1 || nota > 5) {
                System.out.println("Nota inválida! Digite um valor entre 1 e 5.");
            }
        } while (nota < 1 || nota > 5);

        idades[totalAvaliacoes] = idade;
        notas[totalAvaliacoes] = nota;
        totalAvaliacoes++;

        System.out.println("Avaliação registrada com sucesso!\n");
    }

    public static void mostrarRelatorio() {
        banner();

        int totalOtimo = 0;
        int somaIdades = 0;

        for (int i = 0; i < totalAvaliacoes; i++) {
            if (notas[i] == 5) totalOtimo++;
            somaIdades += idades[i];
        }

        double mediaIdade = (totalAvaliacoes > 0) ? (double) somaIdades / totalAvaliacoes : 0;
        double percentualOtimo = (totalAvaliacoes > 0) ? ((double) totalOtimo / totalAvaliacoes) * 100 : 0;

        System.out.println("========= RELATÓRIO =========");
        System.out.println("Coxinhas vendidas: " + totalCoxinhasVendidas);
        System.out.printf("Faturamento do dia: R$ %.2f%n", faturamentoTotal);
        System.out.printf("Média de idade dos clientes: %.1f anos%n", mediaIdade);
        System.out.printf("Percentual de avaliações Ótimas: %.2f%%%n", percentualOtimo);
        System.out.println("==============================\n");
    }
}
