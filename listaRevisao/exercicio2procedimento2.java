package tarefaSegunda;
import java.util.Scanner;

public class exercicio2procedimento2 {
    public static void tabuada(int num){
        int resultado = 0;
        for(int i = 0; i <= 10 ; i++){
            resultado = num*i;
            System.out.printf(" %d \n", resultado);
        }
    }
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num = ler.nextInt();
    tabuada(num);
    ler.close();
    }
}