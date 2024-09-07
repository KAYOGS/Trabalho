package javinha;

import java.util.Scanner;
import java.util.Stack;

public class editorTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> texto = new Stack<>();

        String entrada;
        String dados;
        String ctrl = "ctrl z";

        do {
            System.out.println();
            System.out.println("-------------------------------Editor de texto-------------------------------");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Escreva um texto: ");
            dados = scanner.nextLine();
            System.out.println();

            if(dados != null){
                texto.add(dados);
            }

            if(dados == null ? ctrl == null : dados.equals(ctrl)){
                texto.pop();
                texto.pop();
            }
            
            System.out.println(texto);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Excrita mais recente: " + "[ " + texto.peek() + " ]\n");

            System.out.println();
            System.out.print("\nContinuar? ");
            entrada = scanner.nextLine();
        } while (!entrada.equalsIgnoreCase("n"));

        System.out.println("Operação encerrada!");
        scanner.close();
    }
    
}