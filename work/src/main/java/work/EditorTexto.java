package work;

import java.util.LinkedList;
import java.util.Scanner;

public class EditorTexto {
    public static void main(String[] args) {
        LinkedList<Character> editor = new LinkedList<Character>();
        Scanner leitor = new Scanner(System.in);
        String entrada;
        int opcao;

        System.out.println("Editor de Texto Simples");

        do {
            System.out.print("\nMenu de Operações:");
            System.out.println("1. Adicionar caractere:");
            System.out.println("2. Remover último caractere:");
            System.out.println("3. Buscar caractere:");
            System.out.println("4. Exibir editor:");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção:");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o cache do scanner

            switch (opcao) {
                case 1:
                    // Adicionando um caractere ao editor
                    System.out.print("Digite um caractere para adicionar: ");
                    entrada = leitor.nextLine();
                    if (entrada.length() == 1) {
                        editor.add(entrada.charAt(0));
                        System.out.println("Caractere '" + entrada.charAt(0) + "' adicionado.");
                    } else {
                        System.out.println("Por favor, insira apenas um caractere.");
                    }
                    break;

                case 2:
                    // Removendo o último caractere
                    if (!editor.isEmpty()) {
                        char removedChar = editor.removeLast();
                        System.out.println("Último caractere '" + removedChar + "' removido.");
                    } else {
                        System.out.println("O editor está vazio. Nada para remover.");
                    }
                    break;

                case 3:
                    // Buscando um caractere
                    System.out.print("Digite um caractere para buscar: ");
                    entrada = leitor.nextLine();
                    if (entrada.length() == 1) {
                        int index = editor.indexOf(entrada.charAt(0));
                        if (index != -1) {
                            System.out.println("Caractere '" + entrada.charAt(0) + "' encontrado no índice: " + index);
                        } else {
                            System.out.println("Caractere '" + entrada.charAt(0) + "' não encontrado.");
                        }
                    } else {
                        System.out.println("Por favor, insira apenas um caractere.");
                    }
                    break;

                case 4:
                    // Exibindo o conteúdo atual do editor
                    System.out.print("Conteúdo atual: ");
                    if (editor.isEmpty()) {
                        System.out.println("O editor está vazio.");
                    } else {
                        for (char c : editor) {
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do editor...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        leitor.close();
    }
}