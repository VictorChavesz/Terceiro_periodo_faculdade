package lista1recurcao;

public class exercicio4 {
    
    static void percorrerMatrizRecursivo(int [][] matriz, int linha ){

        if (linha < matriz.length) {
            exercicio2.percorrerVetorRecursivo(matriz[linha],0);
            System.out.println();
            percorrerMatrizRecursivo(matriz, linha+1);
        }

    } 
    public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];
        
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                matriz[i][j] = (int)(Math.random()*10); 
            }
        }
        percorrerMatrizRecursivo(matriz, 0);
    }
}
