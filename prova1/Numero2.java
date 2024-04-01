package prova;

public class Numero2 {
    public static void valorRelativo(int num){
        int aux = num;
        if(num < 100){
            System.out.print(num/10 + " dezenas ");
            System.out.print(" " + num%10 + " unidades ");
        }else{
            for(int i = 0 ; i < 2 ; i++){
                if(aux > 100){
                    System.out.print(+ num/100 + " centenas ");
                    aux = num%100;
                }else{
                    System.out.print(" " + aux/10 + " dezenas ");
                    System.out.print(" " + aux%10 + " unidades ");
                }
            }
        }
    }
    public static void main(String[] args) {
        valorRelativo(895);
    }
}
