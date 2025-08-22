/*--------------------------
*****  EXERCICIO 09  ******
----------------------------
Lista de Tarefas (ArrayList): Crie um programa que gerencia uma lista de tarefas (Strings). Permita ao usuário: adicionar uma tarefa, remover uma tarefa pelo seu índice e listar todas as tarefas. Use um ArrayList.*/

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1-Adicionar 2-Remover 3-Listar 0-Sair");
            int op = sc.nextInt();
            sc.nextLine();
            if (op == 0) break;
            if (op == 1) {
                System.out.print("Tarefa: ");
                tarefas.add(sc.nextLine());
            } else if (op == 2) {
                System.out.print("Índice para remover: ");
                int idx = sc.nextInt(); sc.nextLine();
                if (idx >= 0 && idx < tarefas.size()) tarefas.remove(idx);
                else System.out.println("Índice inválido");
            } else if (op == 3) {
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(i + ": " + tarefas.get(i));
                }
            }
        }
        sc.close();
    }
}
