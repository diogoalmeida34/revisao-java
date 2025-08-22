/*--------------------------
*****  EXERCICIO 18  ******
----------------------------
Dicionário Simples (HashMap): Crie um HashMap para funcionar como um dicionário de tradução simples (Português -> Inglês). Adicione 5 palavras e suas traduções. Peça ao usuário uma palavra em português e, se ela existir no mapa, exiba sua tradução.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("casa", "house");
        dict.put("carro", "car");
        dict.put("livro", "book");
        dict.put("janela", "window");
        dict.put("porta", "door");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra em português: ");
        String p = sc.nextLine();
        if (dict.containsKey(p)) {
            System.out.println("Tradução: " + dict.get(p));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }
        sc.close();
    }
}
