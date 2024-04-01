package lista05.ex05;

public class Calculadora {
    private int valor1;
    private int valor2;

    public Calculadora(){
        this.valor1 = 6;
        this.valor2 = 8;
    }

    public void soma(){
        System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2));
    }
    
    public void subtracao(){
        System.out.println(valor1 + " -  " + valor2 + " = " + (valor1 - valor2));
    }
    
    public void multiplicacao(){
        System.out.println(valor1 + " X " + valor2 + " = " + (valor1 * valor2));
    }
    
    public void divisao(){
        System.out.println(valor1 + " / " + valor2 + " = " + (valor1  / valor2));
    }

}
