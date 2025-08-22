/*--------------------------
*****  EXERCICIO 14  ******
----------------------------
Unicidade de E-mails (HashSet): Crie um HashSet para armazenar endereços de e-mail (Strings). Tente adicionar alguns e-mails, incluindo um que seja duplicado. Imprima o tamanho do Set para confirmar que o e-mail duplicado não foi adicionado.*/

import java.util.HashSet;

public class exercicio14 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("a@ex.com");
        emails.add("b@ex.com");
        emails.add("a@ex.com"); // duplicado
        System.out.println("E-mails: " + emails);
        System.out.println("Tamanho do set: " + emails.size());
    }
}
