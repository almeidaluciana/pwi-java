package exemplos;

import java.util.Scanner;

public class MinMax2 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMEROS_A_SEREM_LIDOS = 3;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < NUMEROS_A_SEREM_LIDOS; i++) {
            System.out.println("Digite um número inteiro: ");
            int num = sc.nextInt();

            if (num < min){
                min = num;
            }

            if (num > max){
                max = num;
            }
        }

        System.out.println("O maior número é: "+max);
        System.out.println("O menor número é: "+min);
    }
}
