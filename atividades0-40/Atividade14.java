public class Atividade14 {

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Primos até 30: ");
        for (int i = 2; i <= 30; i++) {
            if (ehPrimo(i)) System.out.print(i + " ");
        }
    }
}
