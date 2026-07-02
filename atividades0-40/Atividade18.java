public class Atividade18 {

    static int maiorDoVetor(int[] v) {
        int maior = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) maior = v[i];
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] v = {5, 3, 9, 1, 7, 2};
        System.out.println("Maior: " + maiorDoVetor(v)); // 9
    }
}
