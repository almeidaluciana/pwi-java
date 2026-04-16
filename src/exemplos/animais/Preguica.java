package exemplos.animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println(nome + " (Preguiça): Zzzzz");
    }

    public void subirArvore() {
        System.out.println(nome + " está subindo na árvore");
    }
}
