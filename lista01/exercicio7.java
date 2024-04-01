package primeiraLista;
import java.util.Scanner;

public class exercicio7 {
    public static void tetracao(int base , int altura){
        if (base < 1 || base > 7 || altura < 2 || altura > 4) {
            throw new IllegalArgumentException("Base deve estar entre 1 e 7, e altura entre 2 e 4");
        }
        
        double resultado = base;
        for (int i = 1; i < altura; i++) {
            resultado = Math.pow(base, resultado);
        }
        System.out.println(resultado);
    }    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a base");
        int base = ler.nextInt();

        System.out.println("informe a");
        int altura = ler.nextInt();

        tetracao(base, altura);

        ler.close();
    }
}
