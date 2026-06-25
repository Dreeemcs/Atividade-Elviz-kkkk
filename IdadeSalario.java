import java.util.Scanner;

public class IdadeSalario {
	public static void main(String[] args) {
		Scanner elvizkkk = new Scanner(System.in);
		int funcionario[][] = new int[3][2];
		preencherMatriz67(funcionario, elvizkkk);
		imprimirMatriz67(funcionario, elvizkkk);

		elvizkkk.close();
	}

	public static void preencherMatriz67 (int funcionario[][], Scanner elvizkkk) {
		for (int i = 0; i < funcionario.length; i++) {
			System.out.println("Digite a idade do funcionário " + (i + 1) + ":");
			funcionario[i][0] = elvizkkk.nextInt();
			System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
			funcionario[i][1] = elvizkkk.nextInt();

		}
	}

	public static void imprimirMatriz67(int funcionario[][], Scanner elvizkkk) {
		for (int i = 0; i < funcionario.length; i++) {
			System.out.println("Idade do funcionário " + (i + 1) + ": " + funcionario[i][0]);
			System.out.println("Salário do funcionário " + (i + 1) + ": " + funcionario[i][1]);
		}
	}
}
