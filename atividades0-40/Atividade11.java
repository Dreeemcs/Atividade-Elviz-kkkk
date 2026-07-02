public class Atividade11 {

    static int contarPares(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(contarPares(10)); // 5
        System.out.println(contarPares(7));  // 3
        System.out.println(contarPares(1));  // 0
    }
}
