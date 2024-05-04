package lista11;
import java.io.File;

public class ExcluirArquivo {
    public static void main(String[] args) {
        File arq = new File(Funcao.criarNomeArquivo());

        if(arq.delete()){
            System.out.println("Arquivo deletado");
        }else{
            System.out.println("Arquivo não encontrado");
        }
    }
}
