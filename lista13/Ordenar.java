package lista13;

import java.io.*;
import java.util.Scanner;

public class Ordenar {

    private static final String ARQUIVO_ENTRADA = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\numeros.txt";
    private static final String ARQUIVO_SAIDA = "C:\\Users\\paulo\\OneDrive\\Documentos\\Algoritimos fundionais e recursivos\\lista13\\numerosOrdenados.txt";

    public static void ordenarNumerosEmArquivos() throws IOException {
        int[] numeros = lerNumerosDoArquivo(ARQUIVO_ENTRADA);
        ordenarDecrescente(numeros);
        gravarNumerosNoArquivo(numeros, ARQUIVO_SAIDA);
    }

    private static int[] lerNumerosDoArquivo(String nomeArquivo) throws IOException {
        int[] numeros = new int[contarLinhas(nomeArquivo)];

        try (FileReader fr = new FileReader(nomeArquivo);
             Scanner scanner = new Scanner(fr)) {
            int i = 0;
            while (scanner.hasNextInt()) {
                numeros[i++] = scanner.nextInt();
            }
        }

        return numeros;
    }

    private static int contarLinhas(String nomeArquivo) throws IOException {
        int linhas = 0;

        try (FileReader fr = new FileReader(nomeArquivo);
             BufferedReader br = new BufferedReader(fr)) {
            while (br.readLine() != null) {
                linhas++;
            }
        }

        return linhas;
    }

    private static void ordenarDecrescente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }

    private static void gravarNumerosNoArquivo(int[] numeros, String nomeArquivo) throws IOException {
        try (FileWriter fw = new FileWriter(nomeArquivo);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int numero : numeros) {
                bw.write(numero + "\n");
            }
        }
    }
}
