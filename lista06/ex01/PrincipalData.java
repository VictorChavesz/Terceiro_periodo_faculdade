package lista06.ex01;
import java.util.Scanner;

public class PrincipalData {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Data d1 = new Data();

        d1.exibirData();

        System.out.println("Informe o dia");
        d1.setDia(ler.nextInt());
        
        ler.nextLine();

        System.out.println("Informe o mes");
        d1.setMes(ler.nextLine());
        
        System.out.println("Informe o ano");
        d1.setAno(ler.nextInt());
        
        d1.exibirData();

        ler.close();
    }
}
