public class Atividade21 {

    static String inverter(String s) {
        String resultado = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado += s.charAt(i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(inverter("Java"));  // avaJ
        System.out.println(inverter("12345")); // 54321
        System.out.println(inverter("abcde")); // edcba
    }
}
