package atividade31;

public class TesteAnalisador {
    public static void main(String[] args) {
        Produto p = new Produto(101, "Notebook Gamer", 8500.0);
        AnalisadordeClasse.inspecionar(p);
    }
}
