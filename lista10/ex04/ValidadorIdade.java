package lista10.ex04;

public class ValidadorIdade {
    int ValidarIdade(int idade) throws IdadeValidaException{
        if(idade<0){
            throw new IdadeValidaException("Idade Invalida");
        }
        return idade;
    }
}
