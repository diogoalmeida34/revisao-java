/*--------------------------
*****  EXERCICIO 11  ******
----------------------------
Manipulando o Início e o Fim (LinkedList): Crie uma LinkedList para simular uma fila de atendimento. Adicione 5 nomes de clientes no final da fila. Em seguida, "atenda" os 2 primeiros clientes (removendo-os do início da lista). Por fim, adicione 2 novos clientes "prioritários" no início da fila. Exiba a ordem final da fila.*/

import java.util.LinkedList;

public class exercicio11 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Cliente1");
        fila.add("Cliente2");
        fila.add("Cliente3");
        fila.add("Cliente4");
        fila.add("Cliente5");
        System.out.println("Fila inicial: " + fila);
        // Atender 2 primeiros
        fila.removeFirst();
        fila.removeFirst();
        // Adicionar 2 prioritários no início
        fila.addFirst("PrioritarioA");
        fila.addFirst("PrioritarioB");
        System.out.println("Fila final: " + fila);
    }
}
