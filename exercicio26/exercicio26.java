/*--------------------------
*****  EXERCICIO 26  ******
----------------------------
Catálogo de Produtos por Categoria: Crie uma estrutura de dados para um catálogo de produtos. Use um Map<String, List<Produto>>, onde a chave é o nome da categoria (ex: "Eletrônicos") e o valor é uma lista de objetos da classe Produto pertencentes àquela categoria. Popule a estrutura com alguns dados e depois escreva um código para listar todos os produtos de uma categoria específica.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercicio26 {
    public static void main(String[] args) {
        Map<String, List<ProdutoCat>> catalogo = new HashMap<>();
        catalogo.put("Eletrônicos", new ArrayList<>());
        catalogo.put("Livros", new ArrayList<>());
        catalogo.get("Eletrônicos").add(new ProdutoCat("Fone", 99.9));
        catalogo.get("Eletrônicos").add(new ProdutoCat("TV", 1999.0));
        catalogo.get("Livros").add(new ProdutoCat("Java Básico", 59.9));
        listarCategoria(catalogo, "Eletrônicos");
    }

    static void listarCategoria(Map<String,List<ProdutoCat>> cat, String categoria) {
        System.out.println("Produtos em " + categoria + ":");
        List<ProdutoCat> lista = cat.getOrDefault(categoria, new ArrayList<>());
        for (ProdutoCat p : lista) System.out.println(p);
    }
}

class ProdutoCat {
    private String nome;
    private double preco;
    public ProdutoCat(String n, double p) { nome = n; preco = p; }
    @Override
    public String toString() { return nome + " - R$" + preco; }
}
