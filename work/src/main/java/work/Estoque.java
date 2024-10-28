package work;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Exibir inventário");
            System.out.println("4. Buscar produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o cache

            switch (opcao) {
                case 1:
                    // Adicionando um novo produto
                    System.out.print("Digite o nome do produto para adicionar: ");
                    String novoProduto = leitor.nextLine();
                    inventario.add(novoProduto);
                    System.out.println(novoProduto + " adicionado ao inventário.");
                    break;

                case 2:
                    // Removendo um produto
                    System.out.print("Digite o nome do produto para remover: ");
                    String removerProduto = leitor.nextLine();
                    if (inventario.remove(removerProduto)) {
                        System.out.println(removerProduto + " removido do inventário.");
                    } else {
                        System.out.println(removerProduto + " não encontrado no inventário.");
                    }
                    break;

                case 3:
                    // Exibindo o inventário atual
                    System.out.println("\nInventário atual:");
                    if (inventario.isEmpty()) {
                        System.out.println("O inventário está vazio.");
                    } else {
                        for (String produto : inventario) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 4:
                    // Buscando um produto
                    System.out.print("Digite o nome do produto para buscar: ");
                    String buscarProduto = leitor.nextLine();
                    int listagem = inventario.indexOf(buscarProduto);
                    if (listagem != -1) {
                        System.out.println(buscarProduto + " encontrado no índice: " + listagem);
                    } else {
                        System.out.println(buscarProduto + " não encontrado.");
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        leitor.close();
    }
}