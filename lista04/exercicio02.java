package lista04;

public class exercicio02 {
    public static double somaDeFracoes(double num){
        if(num == 1){
            return 1;
        }
        return 1/num + somaDeFracoes(num-1);
    }
    public static void main(String[] args) {
        somaDeFracoes(5);
    }
}
