package lista05.ex01;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Paulo");
        p1.setIdade(19);
        p1.setAltura(1.78);

        p2.setNome("Ana");
        p2.setIdade(19);
        p2.setAltura(1.60);

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getAltura());
        
        System.out.println();

        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getAltura());

    }
}
