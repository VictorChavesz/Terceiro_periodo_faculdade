package lista11;

import java.io.File;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {

        try {
            File arq = new File(Funcao.criarNomeArquivo());
            Scanner ler = new Scanner(arq);

            while (ler.hasNextLine()) {
                System.out.println(ler.nextLine());
            }
            ler.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
