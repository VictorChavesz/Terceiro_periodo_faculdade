package prova;

public class Numero1 {
    public static double[] bhaskara(double a, double b, double c){
        double delta;
        delta = (b*b) - (4*a*c);
        double x1 = 0;
        double x2 = 0;
        int tamanho = 0;
        
        if(delta > 0){
            tamanho = 2;
            double[] resultado = new double[tamanho];

            x1 = (-(b) + Math.sqrt(delta))/(2*a);
            x2 = (-(b) - Math.sqrt(delta))/(2*a);
            for(int i = 0 ; i < 2 ; i++){
                if(i==0){
                    resultado[i] = x1;
                }else{
                    resultado[i] = x2;
                }
            }
            return resultado;
        }else if(delta == 0){
            tamanho = 1;
            double[] resultado = new double[tamanho];
            
            x1 = -b/2*a;
            for(int i = 0 ; i < 1 ; i++){
                    resultado[i] = x1;
            }
            return resultado;
        }else{
            tamanho = 0;
            double[] resultado = new double[tamanho];
            
            System.out.println("Não existe solução");
            return resultado;
        }
         
    }
    public static void main(String[] args) {
        double[] resultado = bhaskara(1,-3,54);
        
        for(int i = 0 ; i < resultado.length ; i++){
            System.out.println(resultado[i]);
        }
    }
}
