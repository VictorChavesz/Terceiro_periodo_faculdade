package tarefaSegunda;

public class exercicio1procedimento2 {
    public static void imprimirPares(){
        for(int i = 0 ; i <= 100 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        imprimirPares();
    }
}
