package atv3;

/*
 * Crie uma classe Elevador para armazenar as informações de um elevador de prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
 *
 * a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio).
 * b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço).
 * c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele).
 * d. Sobe: para subir um andar (não deve subir se já estiver no último andar).
 * e. Desce: para descer um andar (não deve descer se já estiver no térreo).
 *
 * Obs.: Encapsular todos os atributos da classe (criar os métodos set e get).
 */

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
