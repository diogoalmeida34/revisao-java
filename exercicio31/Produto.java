/*--------------------------
*****  EXERCICIO 31  ******
----------------------------
Inspetor de Classe com Reflection
O primeiro exemplo da aula mostra como listar os métodos de uma classe. Vamos expandir essa ideia para criar um inspetor universal.

Objetivo: Crie uma classe AnalisadorDeClasse com um método estático public static void inspecionar(Object obj). Este método deve receber qualquer objeto Java e imprimir no console:
    - O nome completo da classe do objeto.
    - O nome de todos os seus atributos (campos), incluindo os privados.
    - O nome de todos os seus métodos, incluindo os privados.

Dicas:
    - Use obj.getClass() para obter o objeto Class.
    - Use getDeclaredFields() para obter os atributos.
    - Use getDeclaredMethods() para obter os métodos.

Classe para Teste:
    class Produto {
        private int codigo;
        public String nome;
        protected double preco;

        public Produto(int codigo, String nome, double preco) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
        }

        private double calcularImposto() {
            return preco * 0.1;
        }
    }

    // No seu método main:
    // Produto p = new Produto(101, "Notebook Gamer", 8500.0);
    // AnalisadorDeClasse.inspecionar(p);
*/

package atividade31;

class Produto {
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    private double calcularImposto() {
        return preco * 0.1;
    }
}