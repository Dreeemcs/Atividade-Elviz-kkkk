public class Atividade33 {

    static long fatorial(int n) {
        if (n == 0) return 1; // caso base
        return n * fatorial(n - 1); // caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));  // 120
        System.out.println(fatorial(10)); // 3628800
    }
}
