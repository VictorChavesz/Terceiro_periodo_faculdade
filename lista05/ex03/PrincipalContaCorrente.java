package lista05.ex03;

public class PrincipalContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Pualo", 0, 0);

        c1.verificarSaldo();
        c1.depositar(500.00);
        c1.verificarSaldo();
        c1.saque(800);
        c1.saque(300);
        c1.verificarSaldo();
    }
}
