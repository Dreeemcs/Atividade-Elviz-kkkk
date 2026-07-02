public class Atividade27 {

    static boolean ehTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    static String classificar(double a, double b, double c) {
        if (!ehTriangulo(a, b, c)) return "Inválido";
        if (a == b && b == c) return "Equilátero";
        if (a == b || b == c || a == c) return "Isósceles";
        return "Escaleno";
    }

    public static void main(String[] args) {
        System.out.println(classificar(3, 3, 3));  // Equilátero
        System.out.println(classificar(3, 3, 5));  // Isósceles
        System.out.println(classificar(3, 4, 5));  // Escaleno
        System.out.println(classificar(1, 2, 10)); // Inválido
    }
}
