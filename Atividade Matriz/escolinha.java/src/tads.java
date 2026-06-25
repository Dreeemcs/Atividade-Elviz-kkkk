import java.util.Scanner;

public class tads {
    static Scanner elvizkkk;
    static Aluno turma[];

    public static void main(String[] args) {
        System.out.println("Criando 3 Alunos:");
        turma = new Aluno[30];
        elvizkkk = new Scanner(System.in);

        System.out.println("Informe nome e conceito do aluno:");

        turma[1] = new Aluno();

        turma[1].nome = elvizkkk.next();
        turma[1].conceito = elvizkkk.next().charAt(0);
        System.out.println("Aluno informado e seu conceito: ");
        System.out.println(turma[1].nome);
        System.out.println(turma[1].conceito);

    }

}
