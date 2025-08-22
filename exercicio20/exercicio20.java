/*--------------------------
*****  EXERCICIO 20  ******
----------------------------
Agenda de Contatos: Use um HashMap para criar uma agenda onde a chave é o nome do contato (String) e o valor é o número de telefone (String). Permita ao usuário: adicionar um novo contato, buscar um telefone pelo nome e listar todos os contatos (nome e telefone).*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Map<String,String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1-Adicionar 2-Buscar 3-Listar 0-Sair");
            int op = sc.nextInt(); sc.nextLine();
            if (op == 0) break;
            if (op == 1) {
                System.out.print("Nome: "); String n = sc.nextLine();
                System.out.print("Telefone: "); String t = sc.nextLine();
                agenda.put(n, t);
            } else if (op == 2) {
                System.out.print("Nome para buscar: "); String n = sc.nextLine();
                System.out.println(agenda.getOrDefault(n, "Contato não encontrado"));
            } else if (op == 3) {
                for (Map.Entry<String,String> e : agenda.entrySet()) {
                    System.out.println(e.getKey() + " -> " + e.getValue());
                }
            }
        }
        sc.close();
    }
}
