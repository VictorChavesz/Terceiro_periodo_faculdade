package lista06.ex04;
import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno[] a = new Aluno[3];

        for(int i = 0 ; i < 3 ; i++){
            a[i] = new Aluno();
            
            System.out.println("Informe o nome do " + (i+1) + " aluno");
            a[i].setNome(ler.nextLine());
            
            System.out.println("Informe a matricula do " + (i+1) + " aluno");
            a[i].setMatricula(ler.nextInt());
            ler.nextLine();
            
            a[i].definirNotas();

            System.out.println("--------------------------");
        }

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Aluno " + (i+1));
            a[i].exibirDados();
            System.out.println("--------------------------");
        }

        ler.close();
    }
}
