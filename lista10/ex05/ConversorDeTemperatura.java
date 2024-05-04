package lista10.ex05;


public class ConversorDeTemperatura {
    double converterCelciusParaFahrenheint(double temp) throws TemperaturaInvalidaException{
        if(temp < -273.15){
            throw new TemperaturaInvalidaException("Temperatura Invalida");
        }
        return (temp * (9/5))+32;
    }
}
