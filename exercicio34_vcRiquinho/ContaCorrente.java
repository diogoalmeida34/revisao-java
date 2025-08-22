public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularRendimento(int dias) {
        return 0; //nao gera rendimento
    }
}
