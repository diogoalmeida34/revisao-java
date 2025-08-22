/*--------------------------
*****  EXERCICIO 22  ******
----------------------------
Listagem Ordenada (TreeMap): Crie um TreeMap para armazenar as notas de alunos em uma prova, onde a chave é o nome do aluno (String) e o valor é a nota (Double). Adicione 5 alunos fora de ordem alfabética. Ao listar os alunos e suas notas, observe que o TreeMap os exibe em ordem alfabética pelo nome.*/

import java.util.Map;
import java.util.TreeMap;

public class exercicio22 {
    public static void main(String[] args) {
        Map<String, Double> notas = new TreeMap<>();
        notas.put("Zé", 6.0);
        notas.put("Ana", 8.5);
        notas.put("Carlos", 5.5);
        notas.put("Beatriz", 9.0);
        notas.put("Diego", 7.0);
        for (Map.Entry<String,Double> e : notas.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
