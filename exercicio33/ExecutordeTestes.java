import java.lang.reflect.Method;

public class ExecutorDeTestes {

    public static void executarTestes(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] metodos = clazz.getDeclaredMethods();

        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Erro ao executar " + metodo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}
