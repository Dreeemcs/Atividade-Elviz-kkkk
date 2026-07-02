public class Atividade39 {

    static String paraBinario(int n) {
        if (n == 0) return "0";
        String bits = "";
        while (n > 0) {
            bits = (n % 2) + bits; // adiciona o bit na frente
            n = n / 2;
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(paraBinario(10));  // 1010
        System.out.println(paraBinario(255)); // 11111111
    }
}
