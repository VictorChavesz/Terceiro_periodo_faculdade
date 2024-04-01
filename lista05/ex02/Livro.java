package lista05.ex02;

public class Livro {
    private String titulo; 
    private String autor;
    private int ano;
    private String NumeroDePaginas;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setNumDePag(String NumeroDePaginas){
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    public String getNumeroDePaginas(){
        return NumeroDePaginas;
    }

    public void exibirDadosLivros(){
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Ano:"+ano);
        System.out.println("Quantidade de paginas:" + NumeroDePaginas);
    }
}
