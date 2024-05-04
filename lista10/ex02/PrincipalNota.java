package lista10.ex02;
import java.util.Scanner;

public class PrincipalNota  {
    public static void main(String[] args) throws NotaInvalidaException {
        Scanner ler = new Scanner(System.in);
        double[] nota = new double[3];
        double soma = 0;
        double media = 0;

        for(int i = 0 ; i < 3 ; i++){
            try{
                nota[i] = ler.nextDouble();

                if(nota[i] < 0 || nota[i] > 10){
                    throw new NotaInvalidaException("Nota invalida");
                }

            }catch(NotaInvalidaException nie){
                nota[i] = 0;
                System.out.println(nie.getMessage());
            }
            soma += nota[i];
        }

        media = soma/nota.length;
        System.out.println("Media: " + media);
        ler.close();

    }
}
