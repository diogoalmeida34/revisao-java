public class RendaFixa extends Produto {
    private double rendimentoMensal; //fixo
    private int carenciaDias; //tempo minimo antes de poder retirar o dindin

    public RendaFixa(String nome, String descricao, double rendimentoMensal, int carenciaDias) {
        super(nome, descricao);
        this.rendimentoMensal = rendimentoMensal;
        this.carenciaDias = carenciaDias;
    }

    @Override
    public double calcularRendimento(int dias, double valorInvestido) {
        if (dias < carenciaDias) {
            System.out.println("Investimento dentro do período de carência. Não considerado.");
            return 0;
        }
        return valorInvestido * rendimentoMensal * (dias / 30.0);
    }
}
