/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;
import java.util.Scanner;
public class Lista04_Atv08 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        int [] num = new int[5];
        int soma = 0;
        double media = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "° Numero : " );
            num[i] = Ler.nextInt();
            soma += num[i];
        }
        media = soma/5;
        
        for (int i = 0; i < 5; i++) {
                 System.out.println("Numero - " + (i+1) + " - " + num[i]);  
        } System.out.println("Soma Total: " + soma + "\nMedia: " + media);
    }
}
