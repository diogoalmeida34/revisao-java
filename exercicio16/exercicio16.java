/*--------------------------
*****  EXERCICIO 16  ******
----------------------------
Nomes em Ordem Alfabética (TreeSet): Crie um TreeSet de Strings e adicione 5 nomes de pessoas fora da ordem alfabética. Itere sobre o Set e observe que os nomes são impressos em ordem alfabética natural.*/

import java.util.Set;
import java.util.TreeSet;

public class exercicio16 {
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();
        nomes.add("Pedro"); nomes.add("Ana"); nomes.add("Carlos"); nomes.add("Bruna"); nomes.add("Diego");
        for (String n : nomes) System.out.println(n);
    }
}
