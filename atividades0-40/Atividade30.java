public class Atividade30 {

    static void troco(double pago, double preco) {
        int centavos = (int) Math.round((pago - preco) * 100);
        System.out.printf("Troco: R$ %.2f%n", centavos / 100.0);
        int[] notas = {10000, 5000, 2000, 1000, 500, 200, 100};
        String[] nomes = {"R$100", "R$50", "R$20", "R$10", "R$5", "R$2", "R$1"};
        for (int i = 0; i < notas.length; i++) {
            int qtd = centavos / notas[i];
            if (qtd > 0) System.out.println(qtd + " nota(s) de " + nomes[i]);
            centavos %= notas[i];
        }
    }

    public static void main(String[] args) {
        troco(50.0, 37.0); // troco = R$13,00
    }
}
