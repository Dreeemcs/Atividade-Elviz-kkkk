public class Atividade10 {

    static int somarAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somarAteN(5));   // 15
        System.out.println(somarAteN(10));  // 55
        System.out.println(somarAteN(100)); // 5050
    }
}
