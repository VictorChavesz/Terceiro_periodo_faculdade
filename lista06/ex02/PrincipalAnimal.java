package lista06.ex02;
import java.util.Scanner;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o nome do animal");
        a1.setNome(ler.nextLine());

        System.out.println("Informe a especie dele");
        a1.setEspecie(ler.nextLine());

        a1.exbirDados();

        ler.close();
    }
}
