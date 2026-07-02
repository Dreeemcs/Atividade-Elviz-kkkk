public class Atividade28 {

    static String conceito(double nota) {
        if (nota >= 9) return "A";
        if (nota >= 7) return "B";
        if (nota >= 5) return "C";
        if (nota >= 3) return "D";
        return "F";
    }

    public static void main(String[] args) {
        double[] notas = {10, 8.5, 6.0, 4.0, 1.5};
        for (double n : notas) {
            System.out.println(n + " -> " + conceito(n));
        }
    }
}
