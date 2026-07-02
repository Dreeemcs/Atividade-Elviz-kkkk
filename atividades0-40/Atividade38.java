public class Atividade38 {

    static boolean ehPerfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (ehPerfeito(i)) System.out.println(i); // 6, 28, 496
        }
    }
}
