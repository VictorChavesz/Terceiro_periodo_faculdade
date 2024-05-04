package lista11;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlterarConteudoArquivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // System.out.println("Informe o nome do arquivo que voce deseja alterar");
        String nome = ler.nextLine();

        String caminho = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\";
        
        if(!nome.contains(".txt")){
            nome+= ".txt";
        }

        caminho+=nome;

        // String novoNome = Funcao.criarNovoNomeArquivo();

        // File arquivoAntigo = new File(caminho);
        // File arquivoNovo = new File(novoNome);

        // boolean sucesso = arquivoAntigo.renameTo(arquivoNovo);

        // if (sucesso) {
        //     System.out.println("Arquivo renomeado com sucesso");
        // } else {
        //     System.out.println("Falha ao renomear o arquivo");
        //     return;
        // }

        System.out.println("Agora informe o conteudo do arquivo");
        String conteudo = ler.nextLine();

         try {
            FileWriter fileWriter = new FileWriter(caminho);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(conteudo);
            writer.newLine(); 

            writer.close();

            System.out.println("Conteúdo do arquivo substituído com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
        ler.close();
    }
}
