import java.lang.reflect.Field;

public class TesteConfiguracao {
    public static void main(String[] args) {
        try {
            Configuracao config = new Configuracao();

            Field campoUrl = Configuracao.class.getDeclaredField("urlConexao");

            campoUrl.setAccessible(true);

            campoUrl.set(config, "db.producao.com:5432");

            String valorAtualizado = (String) campoUrl.get(config);
            System.out.println("URL de Conexão atualizada: " + valorAtualizado);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
