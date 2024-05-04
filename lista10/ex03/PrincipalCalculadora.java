package lista10.ex03;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        try{
            System.out.println(c.divisao(2, 2));
        }catch(DivisaoPorZeroException dpze){
            System.out.println(dpze.getMessage());
        }
        System.out.println("Restante...");
    }
}
