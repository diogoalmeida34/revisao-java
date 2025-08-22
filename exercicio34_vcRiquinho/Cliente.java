import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public abstract String getIdentificacao();
}
