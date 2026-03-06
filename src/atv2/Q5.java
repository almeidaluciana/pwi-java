package atv2;

/*
 * Faça um programa que calcule o somatório de um número fornecido pelo usuário:
Ex.: Para um n fornecido igual a 5, o resultado deve ser 15, pois 1+2+3+4+5 = 15
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.println(soma + " + " + i + " = " +(soma + i));
            soma += i;
        }

        System.out.println("Somatório: "+soma);
    }
}
