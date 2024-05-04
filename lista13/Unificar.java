package lista13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Unificar {
    public static void unificar(){
         try {
            BufferedReader leitor1 = new BufferedReader(new FileReader("C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\texto1.txt"));
            BufferedReader leitor2 = new BufferedReader(new FileReader("C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\texto2.txt"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\concatenado.txt"));

            String linhaArquivo1, linhaArquivo2;

            while ((linhaArquivo1 = leitor1.readLine()) != null && (linhaArquivo2 = leitor2.readLine()) != null) {
                escritor.write(linhaArquivo1 + " ");
                escritor.write(linhaArquivo2 + "\n");
            }

            leitor1.close();
            leitor2.close();
            escritor.close();

            System.out.println("Arquivos concatenados com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao concatenar os arquivos: " + e.getMessage());
        }
    }    
}
