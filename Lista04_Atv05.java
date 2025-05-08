package lista04;
import java.util.Scanner;
public class Lista04_Atv05 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        /* VARIAVEIS 
        [0] - Populacao A
        [1] - Populacao B
        */
        int [] populacao = new int[2];
        double [] taxa = new double[2];
        System.out.print("Qual a População do Primeiro Pais? ");
        populacao[0] = Ler.nextInt();
        System.out.print("Sua taxa de crescimento? ");
        taxa[0] = Ler.nextDouble();
        System.out.print("Qual a População do Segundo Pais? ");
        populacao[1] = Ler.nextInt();
        System.out.print("Sua taxa de crescimento? ");
        taxa[1] = Ler.nextDouble();
        
        int anos = 0;
        
        while(populacao[0] < populacao[1]){
            populacao[0] += populacao[0] * taxa[0];
            populacao[1] += populacao[1] * taxa[1];
            anos++; }
        
        System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a de B.");
        System.out.println("População final de A: " + populacao[0]);
        System.out.println("População final de B: " + populacao[1]);
    }
}
