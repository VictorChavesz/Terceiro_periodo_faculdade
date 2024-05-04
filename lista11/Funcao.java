package lista11;
import java.util.Scanner;

public class Funcao {
    public static String criarNomeArquivo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo");
        String nomeArquivo = ler.nextLine();
        
        String caminho = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\";
        
        if(!nomeArquivo.contains(".txt")){
            nomeArquivo += ".txt";
        }

        caminho += nomeArquivo;
        return caminho;
    }

    public static String criarNovoNomeArquivo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome novo do arquivo");
        String nomeArquivo = ler.nextLine();
        
        String caminho = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista11\\";
        
        if(!nomeArquivo.contains(".txt")){
            nomeArquivo += ".txt";
        }

        caminho += nomeArquivo;
        return caminho;
    }

    public String Funcao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Funcao'");
    }
}
