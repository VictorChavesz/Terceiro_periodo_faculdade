package lista06.ex01;

public class Data {
    private int dia;
    private String mes;
    private int ano;

    public Data(){
        this.dia = 24;
        this.mes = "Março";
        this.ano = 2024;
    }

    public void exibirData(){
        System.out.print(dia + "/" + mes + "/" + ano);
        System.out.println();
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(String mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
