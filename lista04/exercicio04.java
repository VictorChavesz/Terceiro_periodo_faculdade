package lista04;
import java.util.Scanner;

public class exercicio04 {
    public static int pell(int n) {
        if (n <= 1) {
            return n;
        }
        return 2 * pell(n - 1) + pell(n - 2); 
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o n-esimo numero que voce quer");
        int n = ler.nextInt();
        
        int resultado = pell(n);
        System.out.println(resultado);

        ler.close();
    }
}
