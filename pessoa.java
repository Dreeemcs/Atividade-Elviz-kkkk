
import java.util.Scanner;

public class pessoa {

    private String nome;
    private int idade;

   

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void apresentar(){

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        pessoa p = new pessoa(nome, idade);
        p.apresentar();
        scanner.close();
    }

}
