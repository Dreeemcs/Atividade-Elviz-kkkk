import java.util.Scanner;

// Exercício de Matrizes: Controle de Produção da Fábrica (2 máquinas, 5 dias úteis)
public class ControleProducao {
    static final String[] DIAS = {"Seg", "Ter", "Qua", "Qui", "Sex"};

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int producao[][] = new int[2][5];

        for (int maquina = 0; maquina < producao.length; maquina++) {
            System.out.println("Máquina " + (maquina + 1) + ":");
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                System.out.print(DIAS[dia] + ": ");
                producao[maquina][dia] = teclado.nextInt();
            }
        }

        int maiorProducao = producao[0][0];
        int maquinaMaior = 0, diaMaior = 0;
        int[] totalPorMaquina = new int[producao.length];

        for (int maquina = 0; maquina < producao.length; maquina++) {
            System.out.println("\nProdução Máquina " + (maquina + 1) + ":");
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                System.out.println(DIAS[dia] + ": " + producao[maquina][dia]);
                totalPorMaquina[maquina] += producao[maquina][dia];

                if (producao[maquina][dia] > maiorProducao) {
                    maiorProducao = producao[maquina][dia];
                    maquinaMaior = maquina;
                    diaMaior = dia;
                }
            }
        }

        System.out.println("\nProdução total da fábrica por dia:");
        for (int dia = 0; dia < 5; dia++) {
            int totalDia = 0;
            for (int maquina = 0; maquina < producao.length; maquina++) {
                totalDia += producao[maquina][dia];
            }
            System.out.println(DIAS[dia] + ": " + totalDia + " peças");
        }

        System.out.println("\nMédia semanal:");
        for (int maquina = 0; maquina < producao.length; maquina++) {
            double mediaMaquina = (double) totalPorMaquina[maquina] / 5;
            System.out.printf("Máquina %d: %.0f peças/dia%n", maquina + 1, mediaMaquina);
        }

        System.out.println("\nMaior produção registrada: " + maiorProducao + " peças");
        System.out.println("Máquina: " + (maquinaMaior + 1));
        System.out.println("Dia: " + DIAS[diaMaior]);
    }
}
