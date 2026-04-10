import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner Second = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota = Second.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = Second.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = Second.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = Second.nextDouble();
        double media = (nota + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);

       if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");

        }
       }
    }
