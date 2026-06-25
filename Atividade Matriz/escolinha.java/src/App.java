import java.util.Scanner;

public class App {
    static Scanner elvizkkk;
    static Aluno discente;

    public static void main(String[] args) throws Exception {
        System.out.println("Cadastro de alunos!");
        elvizkkk = new Scanner(System.in);
        discente = new Aluno();
        System.out.println("Informe Nome, Turma, idade e Média do Discente:");

        discente.nome = elvizkkk.next();
        discente.turma = elvizkkk.next();
        discente.idade = elvizkkk.nextInt();
        discente.media = elvizkkk.nextDouble();
        discente.conceito = elvizkkk.next().charAt(0);
        
        System.out.println(discente.nome);
        System.out.println(discente.turma);
        System.out.println(discente.idade);
        System.out.println(discente.media);
        System.out.println(discente.conceito);

    }
}
