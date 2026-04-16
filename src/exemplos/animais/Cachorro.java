package exemplos.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println(nome + " (Cachorro): Au au");
    }

    public void correr() {
        System.out.println(nome + " está correndo");
    }
}
