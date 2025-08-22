/*--------------------------
*****  EXERCICIO 21  ******
----------------------------
Mantendo a Ordem de Cadastro (LinkedHashMap): Crie um LinkedHashMap para armazenar produtos e seus respectivos códigos (ex: Integer como chave, String como valor). Adicione 5 produtos. Itere sobre o mapa e mostre que a ordem de exibição é a mesma da ordem de inserção.*/

import java.util.LinkedHashMap;
import java.util.Map;

public class exercicio21 {
    public static void main(String[] args) {
        Map<Integer,String> produtos = new LinkedHashMap<>();
        produtos.put(101, "Mouse");
        produtos.put(103, "Teclado");
        produtos.put(102, "Monitor");
        produtos.put(104, "Fonte");
        produtos.put(105, "Gabinete");
        for (Map.Entry<Integer,String> e : produtos.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
