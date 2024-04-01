package lista1recurcao;
import java.util.Scanner;

public class exercicio1 {
    
    public static void contagemRecursiva(int num1,int num2){
        if(num2 <= num1){
            System.out.println(num2);
            contagemRecursiva(num1, num2 + 1);
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        
        contagemRecursiva(num, 0);
        
        ler.close();
    }
}
