import java.util.Scanner;

public class Atividade06{
    static double paraFarenheit(double celsius){
        return (celsius * 9/5 + 32);
    }
    public static void main(String[] args){
        Scanner elvizkkk = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celcius: ");
        double celsius = elvizkkk.nextDouble();
        double farenheit = paraFarenheit(celsius);
        System.out.println("A temperatura em Farenheit é: " + farenheit);
        elvizkkk.close();
    }
}