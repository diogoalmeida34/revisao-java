public class RendaVariavel extends Produto {
    private double rendimentoMensalEsperado; //baseado no historico do produto

    public RendaVariavel(String nome, String descricao, double rendimentoMensalEsperado) {
        super(nome, descricao);
        this.rendimentoMensalEsperado = rendimentoMensalEsperado;
    }

    @Override
    public double calcularRendimento(int dias, double valorInvestido) {
        return valorInvestido * rendimentoMensalEsperado * (dias / 30.0);
    }
}
