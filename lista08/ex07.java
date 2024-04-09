package lista09;

public class ex07 {
    public static void main(String[] args) {
        String nome = null;

        try {
            System.out.println(nome.length());
        } catch (NullPointerException npe) {
            System.out.println("Ocorreu um erro" + npe.getMessage());
        }
        System.out.println("Fim do programa");
    }
}
