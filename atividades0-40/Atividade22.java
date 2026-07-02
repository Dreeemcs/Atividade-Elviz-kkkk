public class Atividade22 {

    static String inverter(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
        return r;
    }

    static boolean ehPalindromo(String s) {
        s = s.toLowerCase();
        return s.equals(inverter(s));
    }

    public static void main(String[] args) {
        System.out.println(ehPalindromo("arara")); // true
        System.out.println(ehPalindromo("Ana"));   // true
        System.out.println(ehPalindromo("java"));  // false
        System.out.println(ehPalindromo("radar")); // true
    }
}
