/*--------------------------
*****  EXERCICIO 08  ******
----------------------------
Exceção Personalizada SaldoInsuficienteException: Reutilizando a ideia da ContaBancaria da aula, crie sua própria exceção checada SaldoInsuficienteException. Modifique o método sacar para que, em vez de retornar false, ele lance essa exceção quando o saldo for insuficiente. Crie uma classe de teste para tratar essa exceção com um bloco try-catch.*/

package ExcecaoPersonalizada;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo de " + valor + " insuficiente! Saldo atual: R$" + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}