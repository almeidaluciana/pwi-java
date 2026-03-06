package atv2;

import java.util.Scanner;

/*
 * Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra = "";
        while (!letra.equals("0")){
            System.out.println("Qual seu sexo? \nF - Feminino\nM - Masculino\n0 - Sair\n> ");
            letra = sc.nextLine();

            if (letra.equalsIgnoreCase("F")){
                System.out.println("Feminino");
            } else if (letra.equalsIgnoreCase("M")){
                System.out.println("Masculino");
            } else if (letra.equals("0")) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Sexo inválido");
            }
        }

        sc.close();
    }
}
