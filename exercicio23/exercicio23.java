/*--------------------------
*****  EXERCICIO 23  ******
----------------------------
Verificando a Existência de Chave e Valor: Usando o HashMap do exercício da agenda, escreva um código que verifique se um determinado nome (containsKey) e se um determinado telefone (containsValue) já existem na agenda.*/

import java.util.HashMap;
import java.util.Map;

public class exercicio23 {
    public static void main(String[] args) {
        Map<String,String> agenda = new HashMap<>();
        agenda.put("João", "1111-1111");
        agenda.put("Maria", "2222-2222");
        agenda.put("Pedro", "3333-3333");
        System.out.println("ContainsKey 'Maria': " + agenda.containsKey("Maria"));
        System.out.println("ContainsValue '9999-9999': " + agenda.containsValue("9999-9999"));
        System.out.println("ContainsValue '1111-1111': " + agenda.containsValue("1111-1111"));
    }
}
