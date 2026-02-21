package exemplos;

/*
* Faça um programa que receba 3 números e indique o menor e maior número.
* */

import java.util.Scanner;

public class MinMax1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o 1º número inteiro: ");
        n1 = sc.nextInt();

        System.out.println("Digite o 2º número inteiro: ");
        n2 = sc.nextInt();

        System.out.println("Digite o 3º número inteiro: ");
        n3 = sc.nextInt();

        if (n1 > n2){
            if (n1 > n3) {
                System.out.println("O maior número é: "+ n1);
            } else {
                System.out.println("O maior número é: "+ n3);
            }
        } else {
            if (n2 > n3){
                System.out.println("O maior número é: "+ n2);
            } else {
                System.out.println("O maior número é: "+ n3);
            }
        }

        if (n1 < n2){
            if (n1 < n3) {
                System.out.println("O menor número é: "+ n1);
            } else {
                System.out.println("O menor número é: "+ n3);
            }
        } else {
            if (n2 < n3){
                System.out.println("O menor número é: "+ n2);
            } else {
                System.out.println("O menor número é: "+ n3);
            }
        }
    }
}
