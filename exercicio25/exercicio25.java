/*--------------------------
*****  EXERCICIO 25  ******
----------------------------
Pilha de Livros (Deque como Stack): Use um ArrayDeque para simular uma pilha de livros. Permita ao usuário "empilhar" 3 livros (push). Depois, "desempilhe" um livro (pop) e veja qual foi removido (o último que entrou). Por fim, use peek para "espiar" o livro que está no topo da pilha sem removê-lo.*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Empilhe 3 livros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Livro " + (i+1) + ": ");
            pilha.push(sc.nextLine());
        }
        System.out.println("Desempilhando um livro: " + pilha.pop());
        System.out.println("Livro no topo agora (peek): " + pilha.peek());
        sc.close();
    }
}
