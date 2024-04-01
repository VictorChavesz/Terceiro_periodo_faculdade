package lista1recurcao;

public class exercicio3 {
    static void percorrerVetorRecursivo(int [] vetor, int indice){

        if(indice >= 0){
            System.out.print(" " + vetor[indice] + " ");
            percorrerVetorRecursivo(vetor, indice-1);
        }
    }

    public static void main(String[] args) {
        int vet [] = new int[5];
        for(int i = 0 ; i < vet.length ; i++){
            vet[i]  = (int)(Math.random()*100);
        }

        percorrerVetorRecursivo(vet, vet.length - 1);        
    }
}
