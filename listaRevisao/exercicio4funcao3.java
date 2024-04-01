package tarefaSegunda;
import java.util.Scanner;

public class exercicio4funcao3 {
    public static String parOuImpar(int num){
        if(num % 2 ==0 ){
            return "É par";
        }else{
            return "É impar";
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();
        String resultado = parOuImpar(num);

        System.out.println(resultado);
        
        ler.close();
    }
}
