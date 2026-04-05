
import java.util.Scanner;

// Classe que representa uma pessoa com nome e idade
public class Pessoa {

    private String nome;     // Nome da pessoa
    private int idade;       // Idade da pessoa

   

    // Construtor que inicializa nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Exibe uma apresentação da pessoa
    public void apresentar(){

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");

    }
    
    // Método principal - solicita dados do usuário e exibe apresentação
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
