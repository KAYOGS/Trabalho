package javinha;

import java.util.Scanner;
import java.util.Stack;

public class NavegadorWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historico = new Stack<>();

        String entrada;
        String dados;
        String ctrl = "ctrl z";

        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Navegar para: ");
            dados = scanner.nextLine();
            if(dados != null){
                historico.add(dados);
            }

            if(dados == null ? ctrl == null : dados.equals(ctrl)){
                historico.pop();
                historico.pop();
            }
            
            System.out.println("\nhistórico de navegação \n" + historico);
            
            System.out.print("Navegação mais recente: " + "[ " + historico.peek() + " ]\n");

            System.out.print("\nContinuar? ");
            entrada = scanner.nextLine();
        } while (!entrada.equalsIgnoreCase("n"));

        System.out.println("Operação encerrada!");
        scanner.close();
    }
}