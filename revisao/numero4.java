package revisao.funçoesEProcedimentos;

public class numero4 {
    public static double distanciaEntreDoisPontos(double x1,double y1, double x2, double y2){
        return Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
    }
    public static void main(String[] args) {
        double resultado = distanciaEntreDoisPontos(5, 3, 4, 2);
        System.out.println(resultado);
    }
}
