package primeiraLista;
import java.util.Scanner;

public class exercicio3 {
    public static void encontrarPrimosIntervalo(int primeiro, int segundo){
        for (int i = primeiro; i <= segundo; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
                return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        int primeiro = ler.nextInt();

        System.out.println("Digite segundo o numero");
        int segundo = ler.nextInt();
        
        encontrarPrimosIntervalo(primeiro, segundo);

        ler.close();
        }
}

