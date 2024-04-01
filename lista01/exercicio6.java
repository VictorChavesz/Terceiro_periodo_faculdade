package primeiraLista;

public class exercicio6 {
    public static void imprimirMatriz(int matriz[][]){
        for(int i = 0 ; i < matriz.length ; i++){
            for(int k = 0 ; k < matriz.length ; k++){
                System.out.print(" " + matriz[i][k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for(int i = 0 ; i < matriz.length ; i++){
            for(int k = 0 ; k < matriz.length ; k++){
                matriz[i][k] = (int)(Math.random()*100);
            }
        }
        
        imprimirMatriz(matriz);
    }
}
