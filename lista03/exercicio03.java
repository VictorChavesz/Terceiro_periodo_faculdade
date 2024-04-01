package lista2recurcao;
import java.util.Scanner;

public class exercicio03 {
    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        return base * potencia(base, expoente-1);
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a base");
        int base = ler.nextInt();

        System.out.println("Informe o expoente");
        int expoente = ler.nextInt();

        if(expoente == 0){
            System.out.println("O resultado é 0");
        }
        potencia(base, expoente);

        ler.close();
    }
}
