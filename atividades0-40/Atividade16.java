public class Atividade16 {

    static int somaDigitos(int n) {
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n = n / 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somaDigitos(1234)); // 10
        System.out.println(somaDigitos(999));  // 27
        System.out.println(somaDigitos(100));  // 1
    }
}
