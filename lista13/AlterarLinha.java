package lista13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlterarLinha {
    private static final String NOME_ARQUIVO = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\conteudo.txt";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
            int numLinhas = contarLinhas(NOME_ARQUIVO);

            int numeroLinha = solicitarNumeroLinha(numLinhas);

            exibirConteudoLinha(reader, numeroLinha);

            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (LinhaInvalidaException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int contarLinhas(String nomeArquivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        int linhas = 0;

        while (reader.readLine() != null) {
            linhas++;
        }

        reader.close();
        return linhas;
    }

    private static int solicitarNumeroLinha(int numMaxLinhas) throws LinhaInvalidaException {
        System.out.println("Informe o número da linha desejada (entre 1 e " + numMaxLinhas + "):");
        try {
            int numeroLinha = Integer.parseInt(System.console().readLine());
            if (numeroLinha < 1 || numeroLinha > numMaxLinhas) {
                throw new LinhaInvalidaException("Linha inválida. O número da linha deve estar entre 1 e " + numMaxLinhas);
            }
            return numeroLinha;
        } catch (NumberFormatException e) {
            throw new LinhaInvalidaException("Entrada inválida. Por favor, insira um número válido.");
        }
    }

    private static void exibirConteudoLinha(BufferedReader reader, int numeroLinha) throws IOException {
        String linha;
        int linhaAtual = 0;

        while ((linha = reader.readLine()) != null) {
            linhaAtual++;
            if (linhaAtual == numeroLinha) {
                System.out.println("Conteúdo da linha " + numeroLinha + ":");
                System.out.println(linha);
                return;
            }
        }
    }
}

class LinhaInvalidaException extends Exception {
    public LinhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
