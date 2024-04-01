package primeiraLista;
import java.util.Scanner;

public class exercicio2 {

    public static void calcularFibonacci(int num){
        int resultado = 1;
        int A = 0;
        int B = 0;
        for(int i = 0 ; i < num ; i ++){
            if(i == 0){
                System.out.println(0);
            }else{
                System.out.println(resultado);
                B = A;
                A = resultado;
                resultado = A + B;
            }
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número");
        int num = ler.nextInt();

        calcularFibonacci(num);

        ler.close();
    }
}
