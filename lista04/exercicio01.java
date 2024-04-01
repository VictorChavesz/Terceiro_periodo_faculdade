package lista04;

public class exercicio01 {
    public static void X(int a){
        int resultado = 0;
        for(int i = 0 ; i <= a ; i++){
            resultado += i;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        X(8);
    }
}
