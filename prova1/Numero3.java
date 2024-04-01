package prova;

public class Numero3 {
    public static void exibirMatriz(String[] vetor, int indice){
        if(indice < vetor.length){
            exibirMatriz(vetor, indice+1);
            System.out.println(vetor[indice]);
        }
    }
    public static void main(String[] args) {
        String[] vetor = {"Joao", "Paulo" , "Carlos" , "Kaio"};
        exibirMatriz(vetor, 0);
    }
}
