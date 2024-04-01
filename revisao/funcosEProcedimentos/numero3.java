package revisao.funçoesEProcedimentos;

public class numero3 {
    public static void preencherMatriz(int[][] matriz1, int[][] matriz2){
        for(int i = 0 ; i < 10 ; i++){
            for(int k = 0 ; k < 10 ; k++ ){
                matriz1[i][k] = (int)(Math.random()*10);
                matriz2[i][k] = matriz1[i][k];
            }
        }
    }

    public static void exibirMatriz(int[][] matriz){
        for(int i = 0 ; i < 10 ; i++){
            for(int k = 0 ; k < 10 ; k++){
                System.out.print(" " + matriz[i][k] + " ");
            }
            System.out.println();
        }
    }
    
    public static void trocasMatriz(int[][] matriz1,int[][] matriz2){
        for(int i = 0 ; i < 10 ; i++){
            for(int k = 0 ; k < 10 ; k++){
                matriz1[1][k] = matriz2[7][k];
                matriz1[7][k] = matriz2[1][k];
    
                matriz1[i][3] = matriz2[i][9];
                matriz1[i][9] = matriz2[i][3];
    
                if(i == k){
                matriz1[i][k] = matriz2[i][9-k];
                matriz1[i][9-k] = matriz2[i][k];
                }
            }
        }
        for(int i = 0 ; i < 10 ; i++){
            matriz1[4][i] = matriz2[i][9];
        }
        for(int i = 0 ; i < 10 ; i++){
            matriz1[i][9] = matriz2[4][i];
        }
    }
    public static void main(String[] args) {
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[10][10];

        preencherMatriz(matriz1, matriz2);
        System.out.println("Matriz original");
        exibirMatriz(matriz1);
        System.out.println();

        trocasMatriz(matriz1, matriz2);

        System.out.println("Matriz trocada");
        exibirMatriz(matriz1);
    }
}
