import java.util.Scanner;

public class Atividade40 {

    static String conceito(double nota) {
        if (nota >= 9) return "A";
        if (nota >= 7) return "B";
        if (nota >= 5) return "C";
        if (nota >= 3) return "D";
        return "F";
    }

    static double mediaTurma(double[] notas) {
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        // 1. leia nome e nota de 5 alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }

        // 2. imprima o relatório de cada aluno
        System.out.println("\n--- Relatório da Turma ---");
        for (int i = 0; i < 5; i++) {
            String situacao = notas[i] >= 5 ? "Aprovado" : "Reprovado";
            System.out.println(nomes[i] + " - Nota: " + notas[i]
                    + " - Conceito: " + conceito(notas[i]) + " - " + situacao);
        }

        // 3. imprima a média da turma
        System.out.printf("Média da turma: %.1f%n", mediaTurma(notas));
    }
}
