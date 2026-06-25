public class MatrizNotasComCabecalho {

    static int[][] notas = {
        {8, 9, 7, 7},
        {6, 10, 8, 8},
        {7, 8, 9, 9}
    };

    public static void main(String[] args) {
        imprimeNotas();
    }

    public static void imprimeNotas() {
        System.out.print("        ");
        for (int c = 0; c < notas[0].length; c++) {
            System.out.printf("Nota%-3d", (c + 1));
        }
        System.out.println();

        for (int l = 0; l < notas.length; l++) {
            System.out.printf("Aluno%-3d", (l + 1));
            for (int c = 0; c < notas[l].length; c++) {
                System.out.printf("%-7d", notas[l][c]);
            }
            System.out.println();
        }
    }
}
