import java.util.Scanner;

// Exercício 4 dos slides de Vetores: Pesquisa de Temperaturas (12 meses do ano)
public class PesquisaTemperaturas {
    static final String[] MESES = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] temperaturas = new double[12];
        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura média de " + MESES[i] + ": ");
            temperaturas[i] = teclado.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        int mesMaisQuente = 0;
        int mesMaisFrio = 0;
        int mesesAcimaDaMedia = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[mesMaisQuente]) mesMaisQuente = i;
            if (temperaturas[i] < temperaturas[mesMaisFrio]) mesMaisFrio = i;
            if (temperaturas[i] > media) mesesAcimaDaMedia++;
        }

        System.out.printf("Temperatura média: %.1f%n", media);
        System.out.println("Mês mais quente: " + MESES[mesMaisQuente]);
        System.out.println("Mês mais frio: " + MESES[mesMaisFrio]);
        System.out.println("Meses acima da média: " + mesesAcimaDaMedia);
    }
}
