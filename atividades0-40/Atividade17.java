public class Atividade17 {

    static int somarVetor(int[] v) {
        int soma = 0;
        for (int x : v) {
            soma += x;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Soma: " + somarVetor(numeros)); // 150
    }
}
