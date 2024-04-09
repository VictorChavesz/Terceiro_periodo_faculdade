package lista09;

public class ex08 {
    public static void main(String[] args) {
        int[] num = {8,4,4,5};

        try {
            System.out.println(num[4]);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Ocorreu um erro " + iobe.getMessage());
        }
        System.out.println("Fim do programa");
    }
}
