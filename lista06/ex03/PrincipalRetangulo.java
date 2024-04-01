package lista06.ex03;
import java.util.Scanner;

public class PrincipalRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo r1 = new Retangulo();

        System.out.println("Informe a altura do retangulo");
        r1.setAltura(ler.nextDouble());

        System.out.println("Informe a largura do retangulo");
        r1.setLargura(ler.nextDouble());

        r1.area();
        r1.exibirArea();
        
        ler.close();
    }
}
