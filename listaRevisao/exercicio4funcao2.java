package tarefaSegunda;
import java.util.Scanner;

public class exercicio4funcao2 {
    public static int dobro(int num){
        return 2 * num;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        int resultado = dobro(num);

        System.out.println(resultado);
        
        ler.close();
    }
}
