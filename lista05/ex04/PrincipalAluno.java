package lista05.ex04;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("João");
        a1.setMatricula("784546");

        double nota[] = {8,7,9};
        a1.setNota(nota);

        nota = a1.getNota();

        a2.setNome("Paulo");
        a2.setMatricula("897946");

        double nota2[] = {5,4,6};
        a2.setNota(nota2);

        nota2 = a2.getNota();

        a3.setNome("Luiz");
        a3.setMatricula("898451");

        double nota3[] = {4,9,5};
        a3.setNota(nota3);

        nota3 = a3.getNota();

        System.out.println(a1.getNome());
        System.out.println("matrícula:" + a1.getMatricula());
        System.out.println("As notas são");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(nota[i]);
        }
        a1.calcularMedia();
        a1.aprovaOuReprovado();

        System.out.println("-------------------------");

        System.out.println(a2.getNome());
        System.out.println("matrícula:" + a2.getMatricula());
        System.out.println("As notas são");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(nota2[i]);
        }
        a2.calcularMedia();
        a2.aprovaOuReprovado();

        System.out.println("-------------------------");


        System.out.println(a3.getNome());
        System.out.println("matrícula:" + a3.getMatricula());
        System.out.println("As notas são");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(nota3[i]);
        }
        a3.calcularMedia();
        a3.aprovaOuReprovado();

    }
}
