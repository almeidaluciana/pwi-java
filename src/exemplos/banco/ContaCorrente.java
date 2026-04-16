package exemplos.banco;

public class ContaCorrente implements Conta {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void calcularJuros() {
        saldo += saldo * 0.02;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void cobrarTaxa() {
        saldo -= 10;
    }
}
