package lista04;
import java.util.Scanner;

public class exercicio05 {
    public static void binario(int num){
        if(num > 0){
            binario(num/2);
            System.out.print(num%2);
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero");
        int n = ler.nextInt();
        System.out.print("O binario de " + n + " é ");
        binario(n);

        ler.close();
    }
}
