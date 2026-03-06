package atv2;

import java.util.Scanner;

/*
 * Faça um programa que pergunte em que turno você estuda. Peça para digitar M-Matutino ou V- Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra = "";

        while (!letra.equals("0")){
            System.out.println("Em que turno você estuda? \nM - Matutino\nV - Vespertino\nN - Noturno\n0 - Sair\n> ");
            letra = sc.nextLine();

            if (letra.equalsIgnoreCase("M")){
                System.out.println("Bom dia!");
            } else if (letra.equalsIgnoreCase("V")){
                System.out.println("Boa tarde!");
            } else if (letra.equalsIgnoreCase("N")) {
                System.out.println("Boa noite!");
            } else if (letra.equals("0")) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Valor inválido!");
            }
        }
        sc.close();
    }
}
