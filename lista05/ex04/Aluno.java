package lista05.ex04;
import java.util.Scanner;


public class Aluno {
    private String nome;
    private String matricula;
    private double nota[] = new double[3];

    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNota(double[] nota){
        this.nota = nota;
    }

    public double[] getNota(){
        return this.nota;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }
    
    public void preencherNota(){
        Scanner ler = new Scanner(System.in);

        for(int i = 0 ; i < nota.length; i++){
            System.out.println("Informe a " + i+1 + " nota");
            nota[i] = ler.nextDouble();
        }
    }
    public void calcularMedia(){
        int soma = 0;
        int media = 0;
        for(int i = 0; i < nota.length ; i++){
            soma += nota[i];
        }
        media = soma/3;
        System.out.println("A média do aluno " + nome + " é " + media);
    }
    
    public void aprovaOuReprovado(){
        if((nota[0] + nota [1] + nota [2])/3 < 7){
            System.out.println(nome + " reprovado");
        }else{
            System.out.println(nome + " aprovado");
        }
    }
}
