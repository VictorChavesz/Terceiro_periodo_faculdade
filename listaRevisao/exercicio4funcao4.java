package tarefaSegunda;
import java.util.Scanner;

public class exercicio4funcao4 {
    public static int modulo(int num){
        return Math.abs(num);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        int resultado = modulo(num);

        System.out.println(resultado);

        ler.close();
    }
}
