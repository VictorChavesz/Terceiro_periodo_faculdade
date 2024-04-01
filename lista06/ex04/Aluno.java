package lista06.ex04;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas = new double[3];


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void definirNotas(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3 ; i++){
            System.out.println("Informe a " + (i+1) + " nota");
            notas[i] = input.nextDouble();
        }
    }

    public void media(){
        double media = (notas[0] + notas[1] + notas[2])/3;
        System.out.println(media);
    }

    public void exibirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("Matricula:" + matricula);
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("nota " + (i+1) + ":" + notas[i]);
        }
        System.out.println("A media é");
        media();
    }
}
