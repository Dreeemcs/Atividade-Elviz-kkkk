import java.util.Scanner;
public class Atividade05 {
static int dobro(int n) {
return n * 2;
}
static int triplo(int n) {
return n * 3;
}
public static void main(String[] args) {
Scanner elvizkkk = new Scanner(System.in);
System.out.print("Digite um número: ");
int n = elvizkkk.nextInt();
System.out.println("Dobro: "
+ dobro(n));
System.out.println("Triplo: " + triplo(n));
elvizkkk.close();

}
}