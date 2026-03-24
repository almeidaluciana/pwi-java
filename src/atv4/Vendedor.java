package atv4;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorVendas, int comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        double valorComissao = valorVendas * comissao/100;
        return super.getSalarioBase() + valorComissao;
    }
}
