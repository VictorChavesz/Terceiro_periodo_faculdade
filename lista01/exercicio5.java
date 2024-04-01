package primeiraLista;

public class exercicio5 {
    public static void imprimirVetor(int vet[]){
        for(int i = 0 ; i < vet.length ; i++){
            System.out.print(" " + vet[i] + " ");
        }
    }
    public static void main(String[] args) {
        int vet[] = new int[5];
        for(int i = 0 ; i < vet.length ; i++){
            vet[i] = (int)(Math.random()*10);
        }

        imprimirVetor(vet);
    }
}
