package tarefaSegunda;
import java.util.Scanner;

public class exercicio2procedimento3 {
    public static void impares(int num1 , int num2){
        if(num1 < num2){
            for(int i = num1 ; i <= num2; i++){
                if(i % 2 != 0){
                    System.out.printf(" %d \n", i);
                }
            }
        }
        else{
            for(int i = num2 ; i <= num1; i++){
                if(i % 2 != 0){
                    System.out.printf(" %d \n", i);
                }
            } 
        }
    }
    public static void pares(int num1 , int num2){
        if(num1 < num2){
            for(int i = num1 ; i <= num2; i++){
                if(i % 2 == 0){
                    System.out.printf(" %d \n", i);
                }
            }
        }
        else{
            for(int i = num2 ; i <= num1; i++){
                if(i % 2 == 0){
                    System.out.printf(" %d \n", i);
                }
            } 
        }
    }
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num1 = ler.nextInt();
    int num2 = ler.nextInt();
    
    impares(num1, num2);
    System.out.println("________________________________");
    pares(num1, num2);
    ler.close();
    }
}
