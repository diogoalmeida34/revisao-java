public class ContaCDI extends Conta {
    private static final double CDI = 0.149;  //CDI pesquisado na internet
    private static final double TAXA_SERVICO = 0.0007;

    public ContaCDI(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimento = saldo * (CDI / 30) * dias;
        double taxa = rendimento * TAXA_SERVICO;
        return rendimento - taxa;
    }
}
