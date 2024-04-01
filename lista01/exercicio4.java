package primeiraLista;
import java.util.Scanner;
public class exercicio4 {
    public static void calcularPotencia(int base , int expoente){
        int resultado = 1;
        for(int i = 0 ; i < expoente ; i++){
            resultado = resultado * base;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a base");
        int base = ler.nextInt();

        System.out.println("informe o expoente");
        int expoente = ler.nextInt();

        calcularPotencia(base, expoente);

        ler.close();
    }
}
