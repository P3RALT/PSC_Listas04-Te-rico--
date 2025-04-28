package lista04;
import java.util.Scanner;
public class Lista04_Atv03 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        /* VARIAVEiS 
        [0][0]
        linhas - colunas
        [0][0] - Nome
        [0][1] - Sexo
        [0][2] - Estado Civil
        */ 
        byte opcao = 0;
        
        System.out.println("----- CADASTRO -----");
        System.out.print(" - OLA BOM DIA! BEM VINDO, QUANTOS USUARIOS QUER CADASTRAR? ");
        opcao = Ler.nextByte();
        String[][] user = new String[opcao][3];
        int[] idade = new int[opcao];
        double [] salario = new double[opcao];
            
        try {
            for (int i = 0; i < opcao; i++) {
                System.out.println("----- Cadastrando o " + (i + 1) + "º Usuario -----");
                System.out.print(" - > Qual o Nome do Usuario? ");
                user[i][0] = Ler.next();
                System.out.print(" - > Qual a Idade? ");
                idade[i] = Ler.nextInt();
                System.out.print(" - > Qual o Sexo? (m ou f): ");
                user[i][1] = Ler.next();
                System.out.print(" - > Qual o Estado Civil? (s, c, v ou d): ");
                user[i][2] = Ler.next();
                System.out.print(" - > Qual o Salario Mensal? ");
                salario[i] = Ler.nextDouble();
                
                    if (user[i][0].length() <= 3) {
                        System.out.println("-> !!! Nome deve ter mais que 3 caracteres. Tente novamente.");
                        i = i-1; 
                    continue; }
                    
                    if (idade[i] < 0 || idade[i] > 150) {
                        System.out.println("-> !!! Idade deve ser entre 0 e 150. Tente novamente.");
                        i--;
                    continue; }
                    
                    if (!(user[i][1].equalsIgnoreCase("m") || user[i][1].equalsIgnoreCase("f"))) {
                        System.out.println("-> !!! Sexo inválido. Digite 'm' ou 'f'.");
                        i--;
                    continue; }
                   
                   if (!(user[i][2].equalsIgnoreCase("s") 
                      || user[i][2].equalsIgnoreCase("c")
                      || user[i][2].equalsIgnoreCase("v")
                      || user[i][2].equalsIgnoreCase("d"))) {
                        System.out.println("-> !!! Estado civil inválido. Digite 's', 'c', 'v' ou 'd'.");
                        i--;
                    continue; } 
                   
                    if (salario[i] <= 0) {
                        System.out.println("-> !!! Salário deve ser maior que zero. Tente novamente.");
                        i--;
                    continue;}
                   
        }} catch (ArrayIndexOutOfBoundsException e){
            System.out.println("[ x ] Usuario nao Existe");
        }
        
        
        
        
    }
}
