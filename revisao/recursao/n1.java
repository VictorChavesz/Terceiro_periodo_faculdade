package revisao.recursao;

public class n1 {
    public static void VetorReverso(int vetor[], int indice){
        if(indice >= 0){
            System.out.print(vetor[indice]);
            VetorReverso(vetor, indice-1);
        }
    }
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int indice = vetor.length-1;

        for(int i = 0 ; i < 5 ; i++){
            vetor[i] = (int)(Math.random()*10);
            System.out.print(vetor[i]);
        }
        System.out.println();

        VetorReverso(vetor, indice);
    }
}
