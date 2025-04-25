package lista04;
import java.util.Scanner;
public class Lista04 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int [] opcao = new int [2];
        double [] nota = new double[2];
        
        System.out.print("Ola bom dia, quantas notas vc quer inserir? ");
        opcao[0] = Ler.nextInt();
        
        for (int i = 1; i <= opcao[0]; i++){
            System.out.print("Insira a " + i + "° Nota: ");
            nota[0] = Ler.nextInt();
            if(nota[0] > 10){
                i = i-1;
                System.out.println("[ X ] O Sistema so Aceita Notas de 0 - 10, Repita!");
            }
        }
        
    }
    
}
