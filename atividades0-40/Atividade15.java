public class Atividade15 {

    static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long anterior = 0, atual = 1;
        for (int i = 2; i <= n; i++) {
            long temporaria = atual;
            atual = anterior + atual;
            anterior = temporaria;
        }
        return atual;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacci(i));
        }
    }
}
