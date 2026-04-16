package exemplos.animais;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println(nome + " (Cavalo): Relinchar");
    }

    public void correr() {
        System.out.println(nome + " está correndo");
    }
}