/*--------------------------
*****  EXERCICIO 15  ******
----------------------------
Ordem de Inserção (LinkedHashSet): Crie um LinkedHashSet e adicione os nomes dos dias da semana fora de ordem (ex: "Quarta", "Segunda", "Sexta"). Itere sobre o Set e imprima os elementos para verificar que eles são exibidos na ordem exata em que foram inseridos.*/

import java.util.LinkedHashSet;
import java.util.Set;

public class exercicio15 {
    public static void main(String[] args) {
        Set<String> dias = new LinkedHashSet<>();
        dias.add("Quarta"); dias.add("Segunda"); dias.add("Sexta"); dias.add("Terça");
        for (String d : dias) System.out.println(d);
    }
}
