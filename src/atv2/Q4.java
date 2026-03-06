package atv2;

import java.util.Scanner;

/*
 * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0, impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de números Pares: " + par);
        System.out.println("Quantidade de números Ímpares: " + impar);
        sc.close();
    }
}
