public class Atividade35 {

    static long potencia(int base, int exp) {
        if (exp == 0) return 1; // caso base
        return base * potencia(base, exp - 1); // caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 10)); // 1024
        System.out.println(potencia(3, 4));  // 81
    }
}
