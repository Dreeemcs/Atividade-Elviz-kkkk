import java.util.Scanner;

public class Provajava {
      static void banner(){ 
     System.out.println("=======================");
     System.out.println("    Casa da Coxinha    ");
     System.out.println("======================="); 
    }
    
    
    
    public static void main(String[] args) {
       Scanner elvizkkk = new Scanner(System.in); 
     banner();
     int totalOtimo = 0, totalRuim = 0;
     int menorIdadeRegular = 999;
     int maiorIdadeBom = -1;
     int validas = 0;
     
     while (validas <10) {
        System.out.println("Idade do client " + (validas + 1) + ": ");
        int idade = elvizkkk.nextInt();
        if (idade <= 16) {
            System.out.println("Idade invalida. Informe idade maior que 16 anos. ");

            continue;
        }
        System.out.print("Nota (1 a 5): ");
        int nota = elvizkkk.nextInt();
        if (nota <1 || nota > 5) {
            System.out.println("Nota Inválida.");
            continue;
        }

        validas++;
        if (nota == 5) totalOtimo++;
        if (nota == 2) totalRuim++;
        if (nota == 3 && idade < menorIdadeRegular) menorIdadeRegular = idade;
        if (nota == 4 && idade > maiorIdadeBom) maiorIdadeBom = idade;

          }
          banner();
          System.out.println("Total Ótimo: " + totalOtimo);
          if (menorIdadeRegular == 999)
          System.out.println("Não houve avaliações REGULAR.");
        else
            System.out.println("Mais novo Regular: " + menorIdadeRegular + " anos");
        if (maiorIdadeBom == -1)
            System.out.println("Não houve avaliações Boas.");
        else
            System.out.println("Mais velho com avaliações boas: " + maiorIdadeBom + " anos");
        System.out.println("Total ruim: " + totalRuim);
    }

}
