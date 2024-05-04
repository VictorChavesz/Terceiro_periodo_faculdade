package lista11;

import java.io.FileWriter;
import java.util.Scanner;

public class CriarArquivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String caminho = Funcao.criarNomeArquivo();

        try {
            FileWriter arq = new FileWriter(caminho);

            System.out.println("Arquivo criado com sucesso");

            arq.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    ler.close();
    }
}
