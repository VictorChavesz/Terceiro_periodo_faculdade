package revisao.funçoesEProcedimentos;

public class numero1 {
    public static double medias(double num1, double num2, double num3, char letra){
        letra = Character.toUpperCase(letra);
        if(letra == 'A'){
            return (num1 + num2 + num3)/3;
        }else if(letra == 'P'){
            return (num1*5 + num2*3 + num3*2)/10;
        }else if(letra == 'H'){
            return 3/((1/num1)+(1/num2)+(1/num3));
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        double num = medias(2, 3, 5, 'h');
        System.out.println(num);
    }
}
