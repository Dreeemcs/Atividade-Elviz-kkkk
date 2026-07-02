import java.util.Scanner;

public class Idoso {

    public static void main(String[] args) {
        char op;
        meuBanner();
        do{
          op=menuEscolha();
        }while(op!='d');
    }

    public static char menuEscolha(){
        Scanner teclado = new Scanner(System.in);
        char opcao;
        System.out.println("a. verificar entrada em ônibus \n"+
                           "b. calcular meia entrada \n"+
                           "c. calcular prestação de consignado \n"+
                           "d. encerrar programa \n"+
                           "e. calcular sua renda anual \n"+
                           "f. desconto em farmácia \n"+
                           "g. posso emprestar dinheiro?");

        System.out.print("Digite sua opção:");
        opcao = teclado.next().charAt(0);
        switch (opcao) {
            case 'a':
                System.out.println("Qual ano nasceu?");
                verificaOnibus(teclado.nextInt());
                break;
            // faltam os outros cases
            default:
                System.out.println("* Obrigado e sigo à disposição! *");
                break;
        }
        return opcao;
    }

    public static void verificaOnibus(int ano) {
        int idade;
        idade = 2026-ano;
        System.out.println("Sua idade: "+idade);
        if(idade>64)
             System.out.println("Passagem Gratuita!");
        else System.out.println("Precisa pagar passagem!");
    }

    public static void meuBanner() {
       System.out.println(" ____________________");
       System.out.println("|  *VeioSofts - Dev* |");
       System.out.println("|____________________|");
    }
}
