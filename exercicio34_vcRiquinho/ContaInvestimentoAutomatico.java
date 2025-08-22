import java.util.List;

public class ContaInvestimentoAutomatico extends Conta {
    private List<Produto> produtos;
    private Cliente cliente;

    public ContaInvestimentoAutomatico(double saldo, List<Produto> produtos, Cliente cliente) {
        super(saldo);
        this.produtos = produtos;
        this.cliente = cliente;
    }

    @Override
    public double calcularRendimento(int dias) {
        double totalRendimento = 0;
        for (Produto p : produtos) {
            totalRendimento += p.calcularRendimento(dias, saldo / produtos.size());
        }
        double taxa = (cliente instanceof PessoaFisica) ? 0.001 : 0.0015;
        return totalRendimento - (totalRendimento * taxa);
    }
}
