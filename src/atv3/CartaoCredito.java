package atv3;

/*
 * Crie uma classe que represente um cartão de crédito, que deve ter como atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o valor da fatura.
 */

public class CartaoCredito {
    private double limite;
    private double saldo;
    private String nomeCliente;

    public CartaoCredito(String nomeCliente) {
        this.limite = 1000;
        this.saldo = 0;
        this.nomeCliente = nomeCliente;
    }

    void aumentaLimite(double valor){
        this.limite += valor;
    }

    void diminuiLimite(double valor){
        this.limite -= valor;
    }

    // valor da compra + saldo < limite
    void realizaCompra(double valorCompra){
        if (valorCompra + saldo < limite){
            saldo += valorCompra;
        } else {
            System.out.println("Limite atingido!");
        }
    }

    void imprimeFatura(){
        System.out.println("Fatura: "+saldo);
    }

    public double getLimite() {
        return limite;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}
