package tarefaSegunda;
import java.util.Scanner;

public class exercicio3funcao1 {
    public static double quadrado(int num){
        double resultado = 0;
        resultado = Math.pow(num, 2);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();

        double resultado = quadrado(num);

        System.out.println(resultado);

        ler.close();
    }
}
