package lista2recurcao;

public class exercicio04 {
    public static void fibonacci(int num, int resultado , int b, int a , int cont){
            if(cont < num - 1){
                resultado = a + b;
                System.out.println(resultado);
                fibonacci(num, resultado, b = a, a = resultado, cont + 1);
            }
    }
    public static void main(String[] args) {
        System.out.println(1);
        fibonacci(8, 0, 0, 1, 0);
    }
}
