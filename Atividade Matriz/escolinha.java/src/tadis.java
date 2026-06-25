import java.util.Scanner;

public class tadis {
    static Scanner elvizkkk;
    static Aluno turma[];

    public static void main(String[] args) {
        System.out.println("Criando 4 Alunos:");
        turma = new Aluno[30];
        elvizkkk = new Scanner(System.in);

        setTurma(4);

        System.out.println("Informe nome e conceito do aluno:");

    }
    public static void setTurma(int n){
        int i;
        for(i=0; i<n; i++){
            turma[i] = new Aluno();
            System.out.println("informe nome e conceito do aluno " + (i+1) );
            turma[i].nome = elvizkkk.next();
            turma[i].conceito = elvizkkk.next().charAt(0);
            getTurma(1);
        }
     

    }

}
