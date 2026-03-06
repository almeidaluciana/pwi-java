package atv2;

import java.util.Scanner;

/*
 * Faça um programa que leia 10 números e informe o maior número.
 */
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}