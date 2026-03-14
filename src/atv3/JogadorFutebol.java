package atv3;

/*
 * Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um metodo para imprimir todos os dados do jogador. Crie um metodo para calcular a idade do jogador e outro metodo para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
 */

import java.time.LocalDate;
import java.time.Period;

public class JogadorFutebol {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private int altura;
    private double peso;

    JogadorFutebol(String nome, String posicao, LocalDate dataNascimento, String nacionalidade, int altura, double peso){
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Posição: " + posicao + '\n' +
                "Data de nascimento: " + dataNascimento +'\n'+
                "Nacionalidade: " + nacionalidade + '\n' +
                "Altura: " + altura + " cm"+'\n' +
                "Peso: " + peso + " kg"+'\n' +
                "Idade: "+calcularIdade()+" anos"+'\n' +
                "Tempo para se aposentar: "+tempoParaAposentar()+" ano(s)";
    }

    public int calcularIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int tempoParaAposentar(){
        int idadeAtual = calcularIdade();
        int idadeAposentadoria = 0;

        if (posicao.equalsIgnoreCase("defesa")){
            idadeAposentadoria = 40;
        } else if (posicao.equalsIgnoreCase("meio-campo")) {
            idadeAposentadoria = 38;
        } else if (posicao.equalsIgnoreCase("atacante")) {
            idadeAposentadoria = 35;
        }
        return idadeAposentadoria - idadeAtual;
    }
}
