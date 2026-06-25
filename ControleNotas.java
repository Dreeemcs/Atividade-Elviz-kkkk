import java.util.Scanner;

public class ControleNotas {

    private static Scanner teclado = new Scanner(System.in);
    private static double[][] notas = new double[4][6];

    public static void main(String[] args) {
        coletarNotas();
        exibirResultados();
    }

    public static void coletarNotas() {
        for (int aluno = 0; aluno < notas.length; aluno++) {
            System.out.println("\n--- Aluno " + (aluno + 1) + " ---");
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.print("Nota da matéria " + (materia + 1) + ": ");
                notas[aluno][materia] = Double.parseDouble(teclado.nextLine());
            }
        }
    }

    public static void exibirResultados() {
        double somaGeral = 0;
        int totalNotas = 0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            double somaAluno = 0;
            System.out.print("\nAluno " + (aluno + 1) + " - notas: ");
            for (int materia = 0; materia < notas[aluno].length; materia++) {
                System.out.printf("%.1f ", notas[aluno][materia]);
                somaAluno += notas[aluno][materia];
                somaGeral += notas[aluno][materia];
                totalNotas++;
            }
            System.out.printf("%n Média do aluno: %.2f%n", somaAluno / notas[aluno].length);
        }

        System.out.printf("%nNota média da escola: %.2f%n", somaGeral / totalNotas);
    }
}
