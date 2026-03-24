package atv4;

public class Operario extends Empregado {
    private double valorProducao;
    private int comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double valorProducao, int comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        double valorComissao = valorProducao * comissao/100;
        return super.getSalarioBase() + valorComissao;
    }
}
