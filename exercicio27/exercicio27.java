/*--------------------------
*****  EXERCICIO 27  ******
----------------------------
Sorteio de Ganhadores Únicos: Crie uma lista (ArrayList) com nomes de participantes, permitindo que alguns nomes se repitam. Escreva um método que realize um sorteio: ele deve primeiro garantir que cada participante seja considerado apenas uma vez (mesmo que seu nome apareça várias vezes) e depois sortear aleatoriamente 3 nomes únicos para serem os ganhadores.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class exercicio27 {
    public static void main(String[] args) {
        List<String> participantes = new ArrayList<>();
        participantes.add("Ana"); participantes.add("Bruno"); participantes.add("Ana");
        participantes.add("Carlos"); participantes.add("Bruno"); participantes.add("Daniel");
        Set<String> unicos = new HashSet<>(participantes);
        List<String> pool = new ArrayList<>(unicos);
        Random r = new Random();
        int sorteios = Math.min(3, pool.size());
        System.out.println("Participantes únicos: " + pool);
        System.out.println("Ganhadores:");
        for (int i = 0; i < sorteios; i++) {
            int idx = r.nextInt(pool.size());
            System.out.println(pool.remove(idx));
        }
    }
}
