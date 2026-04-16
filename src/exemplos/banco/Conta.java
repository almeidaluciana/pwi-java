package exemplos.banco;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    void calcularJuros();
    double consultarSaldo();
}
