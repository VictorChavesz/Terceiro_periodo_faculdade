package revisao.recursao;

public class n3 {
    public static int Maximo(int[] vetor, int tamanho){
        if (tamanho == 1) {
            return vetor[0];
        }
        int maiorDoResto = Maximo(vetor, tamanho - 1);
        if (maiorDoResto > vetor[tamanho - 1]) {
            return maiorDoResto;
        } else {
            return vetor[tamanho - 1];
        }
    }
    public static void main(String[] args) {
        int[] vetor = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            vetor[i] = (int)(Math.random()*100);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        int resultado = Maximo(vetor, vetor.length);

        System.out.println(resultado);
    }
}
