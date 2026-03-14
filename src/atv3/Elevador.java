package atv3;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoasNoElevador;

    Elevador(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoasNoElevador = 0;
    }

    public void entra(){
        if (quantidadePessoasNoElevador < capacidadeElevador){
            quantidadePessoasNoElevador++;
            System.out.println("Quantidade de pessoas no elevador: "+ quantidadePessoasNoElevador);
        } else {
            System.out.println("Elevador lotado.");
        }
    }

    public void sai(){
        if (quantidadePessoasNoElevador > 0){
            quantidadePessoasNoElevador--;
            System.out.println("Quantidade de pessoas no elevador: "+ quantidadePessoasNoElevador);
        } else {
            System.out.println("Elevador vazio.");
        }
    }

    public void sobe(){
        if (andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Andar atual: "+andarAtual);
        } else {
            System.out.println("Você já está no último andar.");
        }
    }

    public void desce(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.println("Andar atual: "+andarAtual);
        } else {
            System.out.println("Você está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQuantidadePessoasNoElevador() {
        return quantidadePessoasNoElevador;
    }

    public void setQuantidadePessoasNoElevador(int quantidadePessoasNoElevador) {
        this.quantidadePessoasNoElevador = quantidadePessoasNoElevador;
    }
}
