public class Atividade24 {

    static void ordenar(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] v = {5, 3, 8, 1, 9, 2};
        ordenar(v);
        for (int x : v) System.out.print(x + " "); // 1 2 3 5 8 9
    }
}
