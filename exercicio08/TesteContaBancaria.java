package ExcecaoPersonalizada;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Diogo Almeida", 5000.0);

        try {
            conta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta.sacar(500.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro ao sacar: " + e.getMessage());
        }
    }
}