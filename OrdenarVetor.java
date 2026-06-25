public class OrdenarVetor {

    public static void main(String[] args) {
        int[] vetorOriginal = {17, 36, 48, 12, 10, 38};
        int[] vetorOrdenado;

        System.out.println("\nVetor fora de ordem: ");
        imprimeVetor(vetorOriginal);

        vetorOrdenado = ordenarVetor(vetorOriginal);
        System.out.println("\nVetor ordenado: ");
        imprimeVetor(vetorOrdenado);

        System.out.println("\nSoma dos valores: " + somarVetor(vetorOrdenado));
    }

    public static int[] ordenarVetor(int[] v) {
        int[] copia = v.clone();
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }
        return copia;
    }

    public static int somarVetor(int[] v) {
        int soma = 0;
        for (int valor : v) {
            soma += valor;
        }
        return soma;
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println();
    }
}
