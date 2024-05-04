package lista10.ex01;

public class Pessoa {
    private String nome;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public int getanoNascimento() {
        return anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setanoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int idade(){
        int idade  = 2023 - anoNascimento;
        return idade;
    }
}
