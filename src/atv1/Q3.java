package atv1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite um número real: ");
        double num3 = sc.nextDouble();

        double resultadoA = (num1 * 2) * (num2 / 2.0);
        double resultadoB = (num1 * 3) + num3;
        double resultadoC = Math.pow(num3, 3);

        System.out.println("Resultado A: " + resultadoA);
        System.out.println("Resultado B: " + resultadoB);
        System.out.println("Resultado C: " + resultadoC);

        sc.close();
    }
}
