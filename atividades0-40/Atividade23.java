public class Atividade23 {

    static int contarLetra(String s, char letra) {
        s = s.toLowerCase();
        letra = Character.toLowerCase(letra);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letra) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(contarLetra("programacao", 'a')); // 3
        System.out.println(contarLetra("banana", 'n'));      // 2
    }
}
