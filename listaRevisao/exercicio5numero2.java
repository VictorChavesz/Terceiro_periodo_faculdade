package tarefaSegunda;

public class exercicio5numero2 {
    public static void imprimirPosicaoImpar(String vetor[]){
        for(int i = 0 ; i < vetor.length ; i++){
            if(i % 2 != 0){
                System.out.println(vetor[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] vetor = {"casa", "carro", "gato", "computador", "livro"};
        imprimirPosicaoImpar(vetor);
    }
}
