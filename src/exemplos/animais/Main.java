package exemplos.animais;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Bob", 5);
        Animal a2 = new Cavalo("Pé de Pano", 7);
        Animal a3 = new Preguica("Soneca", 3);

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}
