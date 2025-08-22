/*--------------------------
*****  EXERCICIO 33  ******
----------------------------
Framework de Testes Simulado com Anotações
Este exercício simula como frameworks (JUnit, TestNG) usam reflection para encontrar e executar métodos de teste automaticamente.

Objetivo: Desenvolver um pequeno executor de testes que executa métodos marcados com uma anotação personalizada.

Passos:

- Crie uma anotação:
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;
    import java.lang.annotation.ElementType;

    @Retention(RetentionPolicy.RUNTIME) // Essencial para que a anotação esteja disponível via reflection
    @Target(ElementType.METHOD) // A anotação só pode ser aplicada a métodos
    public @interface Teste {
    }

- Crie uma classe com métodos de "teste":
public class MinhaClasseDeTeste {
    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}

- Crie a classe ExecutorDeTestes:
    - Ela deve ter um método public static void executarTestes(Object obj).
    - Dentro deste método, use reflection para obter todos os métodos da classe do objeto recebido.
    - Itere sobre os métodos e verifique, para cada um, se ele possui a anotação @Teste usando method.isAnnotationPresent(Teste.class).
    - Se um método tiver a anotação, invoque-o dinamicamente usando method.invoke(obj).

*/

public class Main {
    public static void main(String[] args) {
        MinhaClasseDeTeste testes = new MinhaClasseDeTeste();
        ExecutorDeTestes.executarTestes(testes);
    }
}
