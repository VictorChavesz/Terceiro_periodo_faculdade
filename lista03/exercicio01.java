package lista2recurcao;

public class exercicio01 {
    public static void somasPares(int n , int resultado , int cont){
        if(cont <= n){
            if(cont%2==0){
                resultado+=cont;
                System.out.println(resultado);
            }
            somasPares(n, resultado, cont+1);
        }
    }
    public static void main(String[] args) {
        somasPares(10, 0, 1);
    }
}
