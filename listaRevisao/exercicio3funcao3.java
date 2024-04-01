package tarefaSegunda;
import java.util.Scanner;

public class exercicio3funcao3 {
    public static boolean multiploDe3(int num){
        boolean resultado = false;
        if(num % 3 == 0){
            resultado = true;
            return resultado;
        }else{
            resultado = false;
            return resultado;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        boolean resultado = false;

        resultado = multiploDe3(num);
        
        System.out.println(resultado);

        ler.close();
    }
}
