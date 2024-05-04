package lista10.ex03;

public class Calculadora {
    double divisao(int numerador, int denominador) throws DivisaoPorZeroException{
        if(denominador == 0){
            throw new DivisaoPorZeroException("Denominador invalido");
        }
        return numerador/denominador;
    }
}
