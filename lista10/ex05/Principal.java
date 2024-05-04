package lista10.ex05;

public class Principal {
    public static void main(String[] args) {
        ConversorDeTemperatura c = new ConversorDeTemperatura();

        try{
            System.out.println(c.converterCelciusParaFahrenheint(-300));
        }catch(TemperaturaInvalidaException tie){
            System.out.println(tie.getMessage());
        }
        System.out.println("Restante");
    }
}
