import java.util.Scanner;

public class temperaturas {
    /*Entrada: nome da cidade e 6 temperaturas
    Ao final, Seu programa vai retornar:
    Nome da cidade
    Média de temperatura na semana;
    Todas temperaturas registradas;
    Maior temperatura registrada;
    Menor temperatura registrada;*/
 
    //Variáveis "atributos" globais:
    public static int[] temperatura;
    public static String cidade;
    public static Scanner teclado;

    public static void main(String[] args) {
        //instanciação de variáveis
        temperatura = new int[10];
        teclado = new Scanner(System.in);
        setTemperaturas(); //definir cidade e 6 temperaturas
        getTemperaturas(); //imprimir cidade e 6 temperaturas 
        getMediaTemperatura();   
    }

    public static void setTemperaturas(){
        int i; //variável local para ler 6 temperaturas
        System.out.println("*** Programa do Clima ***");
        System.out.println("Informe sua cidade:");
        cidade=teclado.next();
        System.out.println("Informe as ultimas 6 temperaturas registradas ºC");
        for(i=0; i<6; i++)
            temperatura[i] = teclado.nextInt();
    }

    public static void getTemperaturas(){
        int i; // variável local para imprimir 6 temperaturas
        System.out.println("Cidade:"+cidade);
        for(i=0; i<6; i++)
            System.out.printf("\nDia %d: %dºC",i,temperatura[i]);
    }

    public static void getMediaTemperatura(){
        int i, somaT, mediaT;
        somaT=0; //zerar temperaturas
        for(i=0; i<6; i++)
            somaT += temperatura[i]; //acumula as temperaturas
        mediaT=(somaT/6);
        System.out.println("\nMédia de temperatura em ºC:"+mediaT);
    }
}
