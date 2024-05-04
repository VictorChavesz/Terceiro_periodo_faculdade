package lista10.ex01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Scanner ler = new Scanner(System.in);
        
        try{
            if(p1 == null){
                throw new ObjetoNuloExcepiton();
            }
            p1.setNome(ler.nextLine());
            p1.setanoNascimento(ler.nextInt());

            if(p1.getanoNascimento() > 2023){
                throw new AnoInvalidoException();
            }
        }catch(ObjetoNuloExcepiton oe){
            System.out.println(oe.getMessage());
        }catch(AnoInvalidoException aie){
            System.out.println(aie.getMessage());
        }

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.idade());
    }
}
