package primeiraLista;
import java.util.Scanner;


public class exercicio1 {
    public static void verificarPalindromo(String palavra){
        int contador = 0;
        int tamanho = palavra.length() - 1;

        for(int i = 0 ; i < palavra.length(); i++){
            if(palavra.charAt(i) == palavra.charAt(tamanho - i)){
                contador++;
            }
        }
        if(contador == palavra.length()){
            System.out.println("A palavra " + palavra + " é um palindromo");
        }else{
            System.out.println("A palavra " + palavra + " não é um palindromo");
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma palavra");
        String palavra = ler.nextLine();

        verificarPalindromo(palavra);

        ler.close();
    }
}
