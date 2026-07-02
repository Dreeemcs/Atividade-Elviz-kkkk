import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int anoNasc, idade, aposenta; // variável do ano de nascimento - numero inteiro
        double renda, novaRenda; // variável de renda - numero real
        boolean dev; // variável lógica se vc é programador: true ou false
        String nome; // pergunta o nome do programador
        char genero; // define o genero da pessoa
        Scanner teclado = new Scanner(System.in); //instalar entrada
        PrintStream video = new PrintStream(System.out);
        
        //entrada de variáveis:
        video.println("Calculadora de Idade!"); //mensagem para usuário
        video.println("Qual seu nome?");
        nome = teclado.next(); // faz leitura da String nome
        video.println("Você é programador?");
        dev = teclado.nextBoolean();
        video.println("Qual seu genero ? (letra):");
        genero = teclado.next().charAt(0); //forma adequada de ler um char
        video.println("Qual sua renda mensal?");
        renda = teclado.nextDouble();
        video.println("Em que ano nasceu?");
        anoNasc = teclado.nextInt();

        //procedimentos lógicos e aritméticos:
        idade = 2026 - anoNasc; // diz a idade que completa este ano
        renda = renda*13;// renda anual total básica com décimo terceiro
        if(genero=='m'){ //teste para ver se é masculino
            aposenta=70-idade; //daqui quanto tempo aposenta se masculino
        }
        else {
            aposenta=65-idade;// previsão de aposentadoria
        }

        if(dev){
            novaRenda=(renda*3)/13;
        } else novaRenda=renda/13;

        //procedimentos de saída:
        video.println(nome+" este ano completa "+idade+" anos.");
        video.println("Sua renda anual é de R$"+ renda);
        video.println("Faltam "+aposenta+" anos para se aposentar!");
        video.println("DEV seria com renda mensal de R$"+novaRenda);
        video.println("Se fosse DEV pra gringa o salario é R$"+novaRenda*5);
    }
}
