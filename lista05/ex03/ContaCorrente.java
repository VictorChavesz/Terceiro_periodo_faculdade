package lista05.ex03;

public class ContaCorrente {
    private String nomeTitular;
    private double saldo;
    private int numeroDaConta;

    public ContaCorrente(String nomeTitular, double saldo, int numeroDaConta){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }


    public void depositar(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if(valor <= saldo){
            saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void verificarSaldo(){
        System.out.println("O saldo é de " + saldo);
    }
}


