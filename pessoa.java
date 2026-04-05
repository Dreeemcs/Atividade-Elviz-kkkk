
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;

   

    public Pessoa(String nome, int idade) {
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
        Pessoa p = new Pessoa(nome, idade);
        p.apresentar();
        scanner.close();
    }

}
