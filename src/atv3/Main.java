package atv3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Byed", 1200, "Chevrolet", "Preto", 100000);

        System.out.println("Preço: "+carro.getValorCarro());
        System.out.println("Cor: "+carro.getCor());
        carro.darDesconto(500);
        carro.pintar("Rosa");
        System.out.println("Preço: "+carro.getValorCarro());
        System.out.println("Cor: "+carro.getCor());

        CartaoCredito cartao = new CartaoCredito("Luciana");
        System.out.println("Limite: R$ "+cartao.getLimite());
        cartao.realizaCompra(150);
        cartao.realizaCompra(50);
        cartao.realizaCompra(100);
        cartao.imprimeFatura();
        cartao.aumentaLimite(800); //limite de 1800
        System.out.println("Limite: R$ "+cartao.getLimite());
        cartao.realizaCompra(200);
        cartao.imprimeFatura();

        Elevador elevador = new Elevador(5, 3);
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.sai();

        JogadorFutebol jogador = new JogadorFutebol("João", "atacante", LocalDate.of(1992, 2, 5), "Brasileiro", 170, 70);

        System.out.println(jogador);
    }
}
