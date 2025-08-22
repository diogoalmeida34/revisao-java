/*--------------------------
*****  EXERCICIO 13  ******
----------------------------
Removendo Duplicatas: Crie um ArrayList de Integer que contenha números duplicados. Escreva um código que receba esta lista e retorne uma nova coleção sem os elementos duplicados. (Dica: a forma mais fácil é usar um HashSet).*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); lista.add(2); lista.add(2); lista.add(3); lista.add(3); lista.add(3);
        System.out.println("Original: " + lista);
        Set<Integer> semDuplicatas = new HashSet<>(lista);
        List<Integer> resultado = new ArrayList<>(semDuplicatas);
        System.out.println("Sem duplicatas (ordem não garantida): " + resultado);
    }
}
