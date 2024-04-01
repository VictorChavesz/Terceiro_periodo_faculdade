package lista2recurcao;

public class exercicio02 {
    public static void somaVetor(int vet[] , int indice, int resultado){
        if(indice < vet.length){
            resultado+=vet[indice];
            System.out.println(resultado);
            somaVetor(vet, indice+1, resultado);
        }
    }
    public static void main(String[] args) {
        int vet [] = new int[5];
        for(int i = 0 ; i < vet.length ; i++){
            vet[i]  = (int)(Math.random()*100);
        }
        somaVetor(vet, 0, 0);
    }
}
