package atv1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = Math.pow(lado, 2);
        double dobro = area * 2;

        System.out.println("Área do quadrado: " + area);
        System.out.println("Dobro da área: " + dobro);

        sc.close();
    }
}
