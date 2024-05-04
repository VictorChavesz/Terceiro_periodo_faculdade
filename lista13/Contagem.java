package lista13;

import java.io.File;
import java.util.Scanner;

public class Contagem {
    static int contagem(){
        int cont = 0;
        try {
            File arq = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\teste.txt");
            Scanner ler = new Scanner(arq);

            while (ler.hasNextLine()) {
                System.out.println(ler.nextLine());
                cont++;
            }
            ler.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cont;
    }
}
