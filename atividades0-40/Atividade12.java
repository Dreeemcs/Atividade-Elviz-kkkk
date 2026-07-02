public class Atividade12 {

    static long potencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 8)); // 256
        System.out.println(potencia(3, 3)); // 27
        System.out.println(potencia(5, 0)); // 1
    }
}
