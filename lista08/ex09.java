package lista09;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            String nump = ler.nextLine();
            int numero = Integer.parseInt(nump);
            System.out.println("O número digitado é: " + numero);
        } catch (NumberFormatException nfe) {
            System.out.println("Ocorreu um erro " + nfe.getMessage());
        }
        System.out.println("Fim do programa");
        ler.close();
    }
}
