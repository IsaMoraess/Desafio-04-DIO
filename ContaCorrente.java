public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void aplicarRendimento() {
        // Conta corrente não aplica rendimento.
    }
}

