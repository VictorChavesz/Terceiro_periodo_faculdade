package lista06.ex03;

public class Retangulo {
    private double altura;
    private double largura;
    private double area;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void area(){
        area = altura * largura;
    }

    public void exibirArea(){
        System.out.println("A area do triagulo é igual a: "+area + " = " + altura + " X " + largura);
    }
}
