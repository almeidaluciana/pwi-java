package exemplos.banco;

public class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void calcularJuros() {
        saldo += saldo * 0.05;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarTipo() {
        System.out.println("Conta Poupança");
    }
}
