public class Atividade37 {

    static int mdc(int a, int b) {
        if (b == 0) return a; // caso base
        return mdc(b, a % b); // caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(mdc(48, 18));  // 6
        System.out.println(mdc(100, 75)); // 25
    }
}
