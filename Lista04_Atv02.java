package lista04;
import java.util.Scanner;

public class Lista04_Atv02 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        String[][] user = new String[2][1];

        /* 
        user[0][0] = nome do usuário
        user[1][0] = senha do usuário 
        */

        System.out.println("[ ------ LOGIN ------ ]");
        System.out.print("-> Nome de Usuario: ");
        user[0][0] = Ler.next();

        System.out.print("-> Senha: ");
        user[1][0] = Ler.next();

        System.out.println("[ ------ RESULTADO ------ ]");
        if (user[0][0].equals(user[1][0])) {
            System.out.println("❌ Nome de usuário e senha não podem ser iguais!");
        } else {
            System.out.println("✅ Login efetuado com sucesso!");
        }

        
    }
}
