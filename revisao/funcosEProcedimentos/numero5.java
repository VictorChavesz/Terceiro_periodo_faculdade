package revisao.funçoesEProcedimentos;

public class numero5 {
    public static void preencherMatriz(int[][] matriz1){
        for(int i = 0 ; i < 5 ; i++){
            for(int k = 0 ; k < 5 ; k++ ){
                matriz1[i][k] = (int)(Math.random()*10);
            }
        }
    }
    public static void ExibirMatriz(int[][] matriz){
        for(int i = 0 ; i < 5 ; i++){
            for(int k = 0 ; k < 5 ; k++){
                if((i == 0 && (k == 1 || k == 2 || k == 3))){
                    System.out.print("  " + matriz[i][k] + "  ");
                }else if((i == 1 && (k == 0 || k == 2 || k == 4))){
                    System.out.print("  " + matriz[i][k] + "  ");
                }else if((i == 2 && (k == 0 || k == 1 || k == 3 || k == 4))){
                    System.out.print("  " + matriz[i][k] + " ");
                }else if((i == 3 && (k == 0 || k == 2 || k == 4))){
                    System.out.print("  " + matriz[i][k] + "  ");
                }else if((i == 4 && (k == 1 || k == 2 || k == 3))){
                    System.out.print("  " + matriz[i][k] + "  ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        preencherMatriz(matriz);

        ExibirMatriz(matriz);
    }
}
