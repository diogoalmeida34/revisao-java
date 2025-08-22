/*--------------------------
*****  EXERCICIO 28  ******
----------------------------
Invertendo uma Frase: Peça ao usuário uma frase. Use um Deque (como uma pilha) para armazenar cada palavra da frase. Em seguida, desempilhe as palavras uma a uma para formar e exibir a frase na ordem inversa.*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split("\\s+");
        Deque<String> pilha = new ArrayDeque<>();
        for (String p : palavras) pilha.push(p);
        StringBuilder inv = new StringBuilder();
        while (!pilha.isEmpty()) inv.append(pilha.pop()).append(" ");
        System.out.println("Frase invertida: " + inv.toString().trim());
        sc.close();
    }
}
