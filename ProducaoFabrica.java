import java.util.Scanner;

public class ProducaoFabrica {

    private static Scanner teclado = new Scanner(System.in);
    private static int[][] producao = new int[2][5];
    private static String[] dias = {"Seg", "Ter", "Qua", "Qui", "Sex"};

    public static void main(String[] args) {
        coletarDados();
        exibirResultados();
    }

    public static void coletarDados() {
        for (int maquina = 0; maquina < producao.length; maquina++) {
            System.out.println("\nMáquina " + (maquina + 1) + ":");
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                System.out.print(dias[dia] + ": ");
                producao[maquina][dia] = Integer.parseInt(teclado.nextLine());
            }
        }
    }

    public static void exibirResultados() {
        for (int maquina = 0; maquina < producao.length; maquina++) {
            System.out.println("\nProdução Máquina " + (maquina + 1) + ":");
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                System.out.println(dias[dia] + ": " + producao[maquina][dia]);
            }
        }

        System.out.println("\nProdução total da fábrica por dia:");
        for (int dia = 0; dia < dias.length; dia++) {
            int totalDia = 0;
            for (int maquina = 0; maquina < producao.length; maquina++) {
                totalDia += producao[maquina][dia];
            }
            System.out.println(dias[dia] + ": " + totalDia + " peças");
        }

        System.out.println("\nMédia semanal:");
        for (int maquina = 0; maquina < producao.length; maquina++) {
            int soma = 0;
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                soma += producao[maquina][dia];
            }
            System.out.println("Máquina " + (maquina + 1) + ": " +
                (soma / producao[maquina].length) + " peças/dia");
        }

        int maiorProducao = producao[0][0];
        int maquinaMaior = 0, diaMaior = 0;
        for (int maquina = 0; maquina < producao.length; maquina++) {
            for (int dia = 0; dia < producao[maquina].length; dia++) {
                if (producao[maquina][dia] > maiorProducao) {
                    maiorProducao = producao[maquina][dia];
                    maquinaMaior = maquina;
                    diaMaior = dia;
                }
            }
        }
        System.out.println("\nMaior produção registrada: " + maiorProducao + " peças");
        System.out.println("Máquina: " + (maquinaMaior + 1));
        System.out.println("Dia: " + dias[diaMaior]);
    }
}
