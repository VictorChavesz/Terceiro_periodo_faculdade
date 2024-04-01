package lista04;
import java.util.Scanner;

public class exercicio03 {
    public static int tribonacci(int num){
        if(num <= 2){
            return num - 1;
        }
        return tribonacci(num - 1) + tribonacci(num - 2) + tribonacci(num - 3);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o n-esimo numero que voce quer");
        int n = ler.nextInt();
        
        System.out.println(tribonacci(n));
        ler.close();
    }
}
