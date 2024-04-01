package tarefaSegunda;

public class exercicio1procedimento3 {
    public static void tabuada5(){
        int resultado = 0;
        for(int i = 0 ; i <= 10 ; i++){
            resultado = i * 5;
            System.out.println("5 * " + i + " = " + resultado);
        }
    }
    public static void main(String[] args) {
        tabuada5();
    }
}
