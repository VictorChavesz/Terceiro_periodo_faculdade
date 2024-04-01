package revisao.funçoesEProcedimentos;

public class numero2 {
    public static void absoulto(int num){
        int aux = num;
        if(num < 100){
            System.out.println(num/10);
            System.out.println(num%10);
        }else{
            for(int i = 0 ; i < 2 ; i++){
                if(aux > 100){
                    System.out.println(num/100);
                    aux = num%100;
                }else{
                    System.out.println(aux/10);
                    System.out.println(aux%10);
                }
            }
        }
    }
    public static void main(String[] args) {
        absoulto(525);
    }
}
