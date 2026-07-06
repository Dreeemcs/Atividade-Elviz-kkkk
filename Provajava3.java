import java.util.Scanner;

public class Questao3_ShoppingDaCoxinha {

    static Scanner sc = new Scanner(System.in);

    static class Coxinha {
        String sabor;
        char letra;
        double preco;
        int quantidadeVendida;
    }

    static Coxinha[] cardapio = new Coxinha[10];
    static int totalCadastrados = 0;

    static double faturamentoTotal = 0;
    static int totalCoxinhasVendidas = 0;

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
            System.out.println("4 - Cadastrar Sabor");
            System.out.println("5 - Sair");
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
                    cadastrarSabor();
                    break;
                case 5:
                    System.out.println("Encerrando sistema... Relatório final:");
                    mostrarRelatorio();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }

    public static void banner() {
        System.out.println("==========================");
        System.out.println("    SHOPPING DA COXINHA");
        System.out.println("==========================");
    }

    public static void cadastrarSabor() {
        if (totalCadastrados >= cardapio.length) {
            System.out.println("Cardápio cheio! Não é possível cadastrar mais sabores.\n");
            return;
        }

        Coxinha c = new Coxinha();
        sc.nextLine();
        System.out.print("Informar sabor: ");
        c.sabor = sc.nextLine();
        System.out.print("Informar preço: ");
        c.preco = sc.nextDouble();
        c.quantidadeVendida = 0;
        c.letra = Character.toUpperCase(c.sabor.charAt(0));

        cardapio[totalCadastrados] = c;
        totalCadastrados++;

        System.out.println("Sabor cadastrado com sucesso!\n");
    }

    public static void fazerPedido() {
        if (totalCadastrados == 0) {
            System.out.println("Nenhum sabor cadastrado ainda! Cadastre no menu opção 4.\n");
            return;
        }

        System.out.println("Sabores disponíveis:");
        for (int i = 0; i < totalCadastrados; i++) {
            System.out.printf("%c - %s (R$ %.2f)%n", cardapio[i].letra, cardapio[i].sabor, cardapio[i].preco);
        }

        System.out.print("Qual sabor deseja (informe a letra)? ");
        sc.nextLine();
        char escolha = Character.toUpperCase(sc.nextLine().charAt(0));

        int indice = -1;
        for (int i = 0; i < totalCadastrados; i++) {
            if (cardapio[i].letra == escolha) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Sabor não encontrado!\n");
            return;
        }

        System.out.print("Quantas coxinhas deseja comprar? ");
        int qtd = sc.nextInt();

        double valorUnitario = (qtd >= 50) ? 0.80 : cardapio[indice].preco;
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
        System.out.println("Sabor: " + cardapio[indice].sabor);
        System.out.println("Quantidade: " + qtd);
        System.out.printf("Valor unitário aplicado: R$ %.2f%n", valorUnitario);
        System.out.printf("Desconto recebido: R$ %.2f%n", desconto);
        System.out.printf("Valor final do pedido: R$ %.2f%n", valorTotal);
        System.out.println("------------------------\n");

        cardapio[indice].quantidadeVendida = cardapio[indice].quantidadeVendida + qtd;

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

        System.out.println("\n--- Relatório de Sabores ---");
        int indiceMaisVendido = -1;
        int maiorQtd = -1;

        for (int i = 0; i < totalCadastrados; i++) {
            double faturamentoSabor = cardapio[i].quantidadeVendida * cardapio[i].preco;
            System.out.printf("%s - Vendidos: %d - Faturamento: R$ %.2f%n",
                    cardapio[i].sabor, cardapio[i].quantidadeVendida, faturamentoSabor);

            if (cardapio[i].quantidadeVendida > maiorQtd) {
                maiorQtd = cardapio[i].quantidadeVendida;
                indiceMaisVendido = i;
            }
        }

        if (indiceMaisVendido != -1) {
            System.out.println("Sabor mais vendido: " + cardapio[indiceMaisVendido].sabor);
        }
        System.out.println("==============================\n");
    }
}
