package revisao.recursao;

public class n2 {
    public static int soma(int vetor[], int indice){
        if(indice == vetor.length - 1){
            return vetor[indice];
        }
        return vetor[indice] + soma(vetor, indice+1);
    }
    public static void main(String[] args) {
    int[] vetor = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            vetor[i] = (int)(Math.random()*10);
            System.out.print(vetor[i]);
        }
        System.out.println();
        int resultado = soma(vetor, 0);
        System.out.println(resultado);
    }
}
