import java.util.Scanner;
public class Atividade01 {
 

static String saudar(String nome) {
return "Olá, " + nome + "! Seja bem-vindo(a)!";
}
public static void main(String[] args) {
Scanner elvizkkk = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = elvizkkk.nextLine();
System.out.println(saudar(nome));
}
}