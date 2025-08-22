/*--------------------------
*****  EXERCICIO 32  ******
----------------------------
Modificador de Atributos Privados
A aula demonstra como a reflexão pode quebrar o encapsulamento para modificar atributos privados, uma técnica essencial para frameworks de injeção de dependência e ORM.

Objetivo: 
    - Crie uma classe Configuracao com um atributo private String urlConexao = "localhost:5432";. Em outra classe, crie um método main que, sem usar getters ou setters, utilize reflection para alterar o valor deste atributo privado para "db.producao.com:5432". Ao final, imprima o valor para confirmar a alteração.

Dicas:
    - Crie uma instância de Configuracao.
    - Obtenha o Field (campo) correspondente a urlConexao usando getDeclaredField("urlConexao").
    - Torne o campo acessível com field.setAccessible(true).
    - Altere seu valor usando field.set(objetoInstanciado, "novoValor").
    - Para verificar, use field.get(objetoInstanciado) para ler o novo valor e imprimi-lo.
*/

public class Configuracao {
    private String urlConexao = "localhost:5432";
}
