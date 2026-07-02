import java.util.Scanner;

// Exercício de Matrizes: Controle de Notas (4 alunos, 6 matérias)
public class ControleNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[][] = new double[4][6];
        double somaEscola = 0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.print("Aluno " + (aluno + 1) + " - nota da matéria "
                        + (materia + 1) + ": ");
                notas[aluno][materia] = teclado.nextDouble();
                somaEscola += notas[aluno][materia];
            }
        }

        System.out.println("\nNotas de cada aluno em cada matéria:");
        for (int aluno = 0; aluno < notas.length; aluno++) {
            double somaAluno = 0;
            System.out.print("Aluno " + (aluno + 1) + ": ");
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.print(notas[aluno][materia] + " ");
                somaAluno += notas[aluno][materia];
            }
            double mediaAluno = somaAluno / notas[aluno].length;
            System.out.printf(" -> Média: %.2f%n", mediaAluno);
        }

        double mediaEscola = somaEscola / (notas.length * notas[0].length);
        System.out.printf("Nota média da escola: %.2f%n", mediaEscola);
    }
}
