import java.util.Scanner;

public class Atividade32 {

    static String dica(int chute, int secreto) {
        if (chute == secreto) return "Acertou!";
        if (chute > secreto) return "Muito alto!";
        return "Muito baixo!";
    }

    public static void main(String[] args) {
        int secreto = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        String resultado;
        do {
            System.out.print("Digite seu chute (1-100): ");
            int chute = sc.nextInt();
            tentativas++;
            resultado = dica(chute, secreto);
            System.out.println(resultado);
        } while (!resultado.equals("Acertou!"));
        System.out.println("Você acertou em " + tentativas + " tentativa(s)!");
    }
}
