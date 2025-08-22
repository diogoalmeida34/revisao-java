/*--------------------------
*****  EXERCICIO 19  ******
----------------------------
Contador de Frequência de Palavras: Crie uma String contendo um parágrafo de texto. Use um HashMap<String, Integer> para contar a frequência de cada palavra no texto. Ao final, itere sobre o mapa e exiba cada palavra e sua contagem.*/

import java.util.HashMap;
import java.util.Map;

public class exercicio19 {
    public static void main(String[] args) {
        String texto = "este é um texto exemplo. este texto é apenas um exemplo de texto";
        texto = texto.replaceAll("[^\\p{L}\\s]", "").toLowerCase();
        String[] palavras = texto.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String p : palavras) freq.put(p, freq.getOrDefault(p, 0) + 1);
        for (Map.Entry<String,Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
