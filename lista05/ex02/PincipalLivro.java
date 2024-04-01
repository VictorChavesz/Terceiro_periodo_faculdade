package lista05.ex02;

public class PincipalLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        
        l1.setTitulo("One Piece");
        l1.setAutor("Oda genio não tem como");
        l1.setAno(1990);
        l1.setNumDePag("É mais de 8 mil");

        l2.setTitulo("Hajime no Ippo");
        l2.setAutor("Nem sei");
        l2.setAno(1990);
        l2.setNumDePag("É foda mas tambem não sei ahhahah");

        l1.exibirDadosLivros();
        System.out.println();
        l2.exibirDadosLivros();
        
    } 
}
