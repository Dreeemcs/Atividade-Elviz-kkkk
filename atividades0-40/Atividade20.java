public class Atividade20 {

    static int contarVogais(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(contarVogais("Java"));        // 2
        System.out.println(contarVogais("programacao")); // 5
        System.out.println(contarVogais("xyz"));         // 0
    }
}
