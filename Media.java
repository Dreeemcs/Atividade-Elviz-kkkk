import java.util.Scanner;

public class Media {
    double nota1, nota2, nota3, nota4;

    public Media(double n1, double n2, double n3, double n4) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double n4 = sc.nextDouble();

        Media aluno = new Media(n1, n2, n3, n4);
        System.out.println("A média é: " + aluno.calcularMedia());
    }
}