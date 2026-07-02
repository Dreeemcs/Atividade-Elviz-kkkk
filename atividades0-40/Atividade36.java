public class Atividade36 {

    static void contagem(int n) {
        System.out.println(n);
        if (n == 0) {
            System.out.println("LANÇAR!");
            return;
        }
        contagem(n - 1);
    }

    public static void main(String[] args) {
        contagem(5);
    }
}
