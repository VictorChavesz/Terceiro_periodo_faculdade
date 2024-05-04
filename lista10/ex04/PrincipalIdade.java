package lista10.ex04;
import java.util.Scanner;

public class PrincipalIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ValidadorIdade i = new ValidadorIdade();

        try{
            System.out.println("Informe uma idade");
            int idade = ler.nextInt();
            i.ValidarIdade(idade);
        }catch(IdadeValidaException ive){
            System.out.println(ive.getMessage());
        }
        System.out.println("Restante...");
        ler.close();
    }
}
