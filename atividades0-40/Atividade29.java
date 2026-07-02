public class Atividade29 {

    static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public static void main(String[] args) {
        int[] anos = {2024, 1900, 2000, 2023};
        for (int a : anos) {
            System.out.println(a + ": " + (ehBissexto(a) ? "bissexto" : "não bissexto"));
        }
    }
}
