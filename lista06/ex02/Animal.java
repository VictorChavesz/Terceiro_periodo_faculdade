package lista06.ex02;

public class Animal {
    private String nome;
    private String especie;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void exbirDados(){
        System.out.println("Nome:" + nome + "\n" + "Especie:" + especie);
    }
}
