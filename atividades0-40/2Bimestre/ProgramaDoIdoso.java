import java.util.Scanner;

public class ProgramaDoIdoso {

    public static void main(String[] args) {
        char op;
        meuBanner();
        do {
            op = menuEscolha();
        } while (op != 'd');
    }

    public static char menuEscolha() {
        Scanner teclado = new Scanner(System.in);
        char opcao;
        System.out.println("a. verificar entrada em ônibus \n"
                + "b. calcular meia entrada \n"
                + "c. calcular prestação de consignado \n"
                + "d. encerrar programa \n"
                + "e. calcular sua renda anual \n"
                + "f. desconto em farmácia \n"
                + "g. posso emprestar dinheiro?");

        System.out.print("Digite sua opção:");
        opcao = teclado.next().charAt(0);
        switch (opcao) {
            case 'a':
                System.out.println("Qual ano nasceu?");
                verificaOnibus(teclado.nextInt());
                break;
            case 'b':
                System.out.println("Qual ano nasceu?");
                int anoNasc = teclado.nextInt();
                System.out.println("Qual o valor do ingresso?");
                double valorIngresso = teclado.nextDouble();
                calculaMeiaEntrada(anoNasc, valorIngresso);
                break;
            case 'c':
                System.out.println("Qual valor deseja simular?");
                double valor = teclado.nextDouble();
                System.out.println("Quantas parcelas?");
                double parcelas = teclado.nextDouble();
                System.out.println("Qual o juros total (%)?");
                double juros = teclado.nextDouble();
                calculaPrestacaoConsignado(valor, parcelas, juros);
                break;
            case 'e':
                System.out.println("Qual o salário do idoso?");
                double salario = teclado.nextDouble();
                System.out.printf("Renda anual (com 13º incluso): R$ %.2f%n", rendaAnual(salario));
                break;
            case 'f':
                System.out.println("Qual o valor total a ser pago?");
                double valorTotal = teclado.nextDouble();
                System.out.println("Qual a porcentagem de desconto?");
                double percDesconto = teclado.nextDouble();
                System.out.printf("Valor com desconto: R$ %.2f%n",
                        descontoFarmacia(valorTotal, percDesconto));
                break;
            case 'g':
                System.out.println("Qual o salário do idoso?");
                double salarioIdoso = teclado.nextDouble();
                System.out.println("Qual o valor da parcela do consignado?");
                double parcelaConsignado = teclado.nextDouble();
                if (podeEmprestar(salarioIdoso, parcelaConsignado)) {
                    System.out.println("Pode emprestar dinheiro!");
                } else {
                    System.out.println("Não pode emprestar dinheiro.");
                }
                break;
            default:
                System.out.println("* Obrigado e sigo à disposição! *");
                break;
        }
        return opcao;
    }

    public static void verificaOnibus(int ano) {
        int idade;
        idade = 2026 - ano;
        System.out.println("Sua idade: " + idade);
        if (idade > 64)
            System.out.println("Passagem Gratuita!");
        else System.out.println("Precisa pagar passagem!");
    }

    public static void calculaMeiaEntrada(int anoNasc, double valorIngresso) {
        int idade = 2026 - anoNasc;
        if (idade > 64) {
            System.out.println("Tem direito a meia entrada!");
            System.out.printf("Valor da entrada: R$ %.2f%n", valorIngresso / 2);
        } else {
            System.out.println("Não tem direito a meia entrada!");
            System.out.printf("Valor da entrada: R$ %.2f%n", valorIngresso);
        }
    }

    public static void calculaPrestacaoConsignado(double valor, double parcelas, double juros) {
        double prestacao = (valor + (valor * juros / 100)) / parcelas;
        System.out.printf("Valor de cada prestação: R$ %.2f%n", prestacao);
    }

    public static double rendaAnual(double salario) {
        return salario * 13;
    }

    public static double descontoFarmacia(double valorTotal, double percentualDesconto) {
        return valorTotal - (valorTotal * percentualDesconto / 100);
    }

    public static boolean podeEmprestar(double salario, double parcela) {
        double margemConsignado = (parcela / salario) * 100;
        return margemConsignado < 35;
    }

    public static void meuBanner() {
        System.out.println(" ____________________");
        System.out.println("|  *VeioSofts - Dev* |");
        System.out.println("|____________________|");
    }
}
