package lista11;

import java.io.File;

public class VerificarArquivo {
    public static void main(String[] args) {
        File arq = new File(Funcao.criarNomeArquivo());
        
        if(arq.exists()){
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não encontrado");
        }
    }
}
