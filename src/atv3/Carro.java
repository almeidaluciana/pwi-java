package atv3;

public class Carro {
    private String nome;
    private double peso;
    private String fabricante, cor;
    private double valorCarro;

    Carro(String nome, double peso, String fabricante, String cor, double valorCarro){
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        this.fabricante = fabricante;
        this.valorCarro = valorCarro;
    }

    void darDesconto(double desconto){
        valorCarro -= desconto;
    }

    void pintar(String novaCor){
        cor = novaCor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }
}
