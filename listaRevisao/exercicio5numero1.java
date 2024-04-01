package tarefaSegunda;

public class exercicio5numero1 {
    public static void imprimirVetor(int vetor[]){
        for(int i = 0 ; i < vetor.length ; i++){
            System.out.print(" " + vetor[i] + " ");
        }
        
        System.out.println();

        for(int i = vetor.length - 1 ; i >= 0 ; i--){
            System.out.print(" " + vetor[i] + " ");
        }
    }    
    public static void main(String[] args) {
        int vetor[] = new int[(int)(Math.random()*10)];
        for(int i = 0 ; i < vetor.length ; i++){
            vetor[i] = (int)(Math.random()*100);
        }
        imprimirVetor(vetor);
    }
}
