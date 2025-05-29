package lista04;
import java.util.Scanner;
public class Lista04_Atv07 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int [] numero = new int[5];
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("-> Digite o " + (i+1) + "° Numero de 5°: ");
            numero[i] = Ler.nextInt();  
            
                    if (numero[i] > maior) {
                        maior = numero[i];
            }
        } 
            System.out.println("O maior numero é: " + maior);

        }  }
