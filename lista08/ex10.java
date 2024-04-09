package lista09;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = 0 , n2 = (int)(Math.random()*10) , resultado = 0;
        
        try {
            System.out.println("Digite um numero inteiro");
            n1 = ler.nextInt();
            n2=0;
            resultado = n1/n2;
            
        } catch (InputMismatchException ime) {
            System.out.println("Ocorreu um erro digite um numero valido");
        } catch (ArithmeticException ae){
            System.out.println("Ocorreu um erro" + ae.getMessage());
        }

    }
}
