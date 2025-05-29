package lista04;

/*
10. Faça um programa que receba dois números 
inteiros e gere os números  inteiros que estão no intervalo compreendido por eles. 

*/

import java.util.Scanner;
public class Lista04_Atv10 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int [] num = new int[2];
        int [] tam = new int[2];
        for (int i = 0; i < 2; i++) {
                System.out.print("Digite " + (i+1) + " Numero: ");
              num[i] = Ler.nextInt();
        }
        
        tam[0] = Math.min(num[0], num[1]);
        tam[1] = Math.max(num[0], num[1]);
    
        System.out.println("Numero no Intervalo entre " + num[0] + " - e - " + num[1]);
        
        for (int i = tam[0] + 1; i < tam[1]; i++) {
            System.out.print(i + " ");
        }
    }
}
