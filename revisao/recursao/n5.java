package revisao.recursao;

public class n5 {
    public static boolean palindromo(String palavra, int inicio, int fim, int cont){
        if(cont == palavra.length()){
            return true;
        }
        if(palavra.charAt(inicio) == palavra.charAt(fim)){
            return palindromo(palavra, inicio+1, fim-1,cont+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String palavra = "subi";

        boolean vOuF = palindromo(palavra, 0, palavra.length() - 1,0);

        if(vOuF == true){
            System.out.println("A palavra " + palavra +" é um palindromo");
        }else{
            System.out.println("A palavra " + palavra + " não é um palindromo");
        }
    }
}
