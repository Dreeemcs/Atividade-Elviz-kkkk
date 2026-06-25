import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[][] = new double[4][6];

        for (int aluno = 0; aluno < notas.length; aluno++) {
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.print("Nota do aluno " + (aluno + 1) + " na matéria " + (materia + 1) + ": ");
                notas[aluno][materia] = Double.parseDouble(teclado.nextLine());
            }
        }

        double somaGeral = 0;
        int totalNotas = 0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            double somaAluno = 0;
            System.out.println("\nAluno " + (aluno + 1) + ":");
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.printf("  Matéria %d: %.2f%n", materia + 1, notas[aluno][materia]);
                somaAluno += notas[aluno][materia];
                somaGeral += notas[aluno][materia];
                totalNotas++;
            }
            double mediaAluno = somaAluno / notas[aluno].length;
            System.out.printf("  Média do aluno: %.2f%n", mediaAluno);
        }

        double mediaEscola = somaGeral / totalNotas;
        System.out.printf("%nNota média da escola: %.2f%n", mediaEscola);
    }
}
