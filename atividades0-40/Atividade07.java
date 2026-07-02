import java.util.Scanner;

public class Atividade07 {


    static String sinal(int numero) {
 if (numero > 0) {
    return "positivo";
 } else if (numero < 0) {
    return "negativo";
 } else {
    return "zero";
}
    }
public static void main(String[] args) {
System.out.println(sinal(5));// positivo
System.out.println(sinal(-3));// negativo
System.out.println(sinal(0));// zero
}
}