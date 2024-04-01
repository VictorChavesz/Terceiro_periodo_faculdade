package tarefaSegunda;
import java.util.Scanner;

public class exercicio4funcao1 {
    public static int fatorial(int num){
        int resultado = 1;
        if(num > 0){
            for(int i = 1; i <= num ; i++){
                resultado = resultado * i;
            }
            return resultado;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        int resultado = fatorial(num);

        System.out.println(resultado);
        
        ler.close();
    }
}
