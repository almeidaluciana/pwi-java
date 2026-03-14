package atv3;

/*
 * Crie uma classe que represente um carro, que tenha como características o nome, o peso, a fabricante, a cor e o valor do carro. Crie também o metodo darDesconto() que servirá para diminuir o preço do carro e o metodo pintar(), que será responsável por mudar a cor do carro. Crie um carro no seu programa principal, utilize os métodos criados e mostre na tela o preço e a cor do carro antes e depois da utilização dos métodos.
 */

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
