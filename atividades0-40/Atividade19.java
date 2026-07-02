public class Atividade19 {

    static double media(int[] v) {
        int soma = 0;
        for (int x : v) {
            soma += x;
        }
        return (double) soma / v.length;
    }

    public static void main(String[] args) {
        int[] notas = {8, 7, 9, 6, 10};
        System.out.printf("Média: %.1f%n", media(notas)); // 8.0
    }
}
