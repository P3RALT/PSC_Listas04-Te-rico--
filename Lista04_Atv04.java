package lista04;
import java.util.Scanner;
public class Lista04_Atv04 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        /* VARIAVEIS 
        [0] - Populacao A
        [1] - Populacao B
        */
        int [] populacao = new int[2];
        populacao[0] = 80000;
        populacao[1] = 200000;
        double [] taxa = new double[2];
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
