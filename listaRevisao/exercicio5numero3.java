package tarefaSegunda;

public class exercicio5numero3 {
    public static void juncaoDeVetores(int vet1[] , int vet2[]){
        int vet3[] = new int[vet1.length + vet2.length];
        for(int i = 0 ; i < vet1.length ; i++){
            vet3[i] = vet1[i];
            vet3[vet1.length + i] = vet2[i];
        }
        for(int i = 0 ; i < vet3.length ; i++){
            System.out.print(" " + vet3[i] + " ");
        }
    }
    public static void main(String[] args) {
        int vet1[] = new int[5];
        int vet2[] = new int[5];
        
        for(int i = 0 ; i < vet1.length ; i++){
            vet1[i] = (int)(Math.random()*100);
            vet2[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Vetor 1");
        for(int i = 0 ; i < vet1.length ; i++){
            System.out.print(" " + vet1[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor 2");
        for(int i = 0 ; i < vet2.length ; i++){
            System.out.print(" " + vet2[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor3");
        juncaoDeVetores(vet1, vet2);
    }
}
