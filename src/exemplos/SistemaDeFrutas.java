package exemplos;

import java.util.Scanner;

public class SistemaDeFrutas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frutas = new String[5]; // array para armazenar até 5 frutas
        int contador = 0; // quantidade de frutas que foram cadastradas
        int opcao = 0; // opção escolhida pelo usuário no menu

        while (opcao != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar fruta");
            System.out.println("2 - Listar frutas");
            System.out.println("3 - Buscar fruta");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    if (contador < frutas.length) {

                        System.out.print("Digite o nome da fruta: ");
                        String nome = sc.nextLine();

                        frutas[contador] = nome;
                        contador++;

                        System.out.println("Fruta cadastrada com sucesso!");

                    } else {
                        System.out.println("Limite de frutas atingido.");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("Nenhuma fruta cadastrada.");
                    } else {
                        System.out.println("\nLista de frutas:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + " - " + frutas[i]);
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("Nenhuma fruta cadastrada.");
                    } else {
                        System.out.print("Digite o nome da fruta para buscar: ");
                        String busca = sc.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < contador; i++) {
                            if (frutas[i].equals(busca)) {
                                System.out.println("Fruta encontrada na posição " + (i + 1));
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Fruta não encontrada.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
