import java.util.*;

public class anoNasc {
    public static void main(String[] args) {
        Scanner elvizkkkk = new Scanner(System.in);
        int realYear, dataAnv, idade, renda;
        String nome;
        char genero;
        System.out.println("Digite seu nome: ");
        nome = elvizkkkk.nextLine();
        System.out.println("Digite o ano atual: ");
        realYear = elvizkkkk.nextInt();
        System.out.println("digite o ano de nascimento: ");
        dataAnv = elvizkkkk.nextInt();
        idade = realYear - dataAnv;
        System.out.println("digite sua renda mensal: ");
        renda = elvizkkkk.nextInt();
        System.out.println("digite seu gênero (letras):  ");
        genero = elvizkkkk.next().charAt(0);
        System.out.println("Olá, " + nome + "! Sua idade é: " + idade);
        System.out.println("Sua renda mensal é: " + renda);
        System.out.println("Seu gênero é: " + genero);
        System.out.println("Renda anual é: " + (renda * 13));
        elvizkkkk.close();

    }
}