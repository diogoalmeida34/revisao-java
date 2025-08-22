/*--------------------------
*****  EXERCICIO 17  ******
----------------------------
Objetos Personalizados em um TreeSet: Crie uma classe Produto com nome (String) e preco (double). Faça com que a classe Produto implemente a interface Comparable para que os produtos sejam ordenados pelo preço (do menor para o maior). Crie um TreeSet<Produto> e adicione alguns produtos para testar a ordenação.*/

import java.util.Set;
import java.util.TreeSet;

public class exercicio17 {
    public static void main(String[] args) {
        Set<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("Teclado", 120.0));
        produtos.add(new Produto("Mouse", 60.0));
        produtos.add(new Produto("Monitor", 850.0));
        produtos.add(new Produto("Cabo", 20.0));
        for (Produto p : produtos) System.out.println(p);
    }
}

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    public Produto(String nome, double preco) { this.nome = nome; this.preco = preco; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.preco, o.preco);
    }
    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}
