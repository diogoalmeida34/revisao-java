public class Lanchonete {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(45.90, "2023-12-31", 800, 
                               "Calabresa", "Catupiry", "Tomate");
        
        Lanche lanche = new Lanche(22.50, "2023-12-31", 350, 
                                  "Australiano", "Frango", "Barbecue");
        
        Salgadinho salgadinho = new Salgadinho(8.90, "2023-12-31", 100, 
                                              "Frito", "Massa de Batata", "Queijo");
        
        Pedido pedido = new Pedido("João Silva", 10.0);
        
        pedido.adicionarItem(pizza);
        pedido.adicionarItem(lanche);
        pedido.adicionarItem(salgadinho);
        
        NotaFiscal nota = new NotaFiscal(pedido);
        nota.gerarNota();
        
        double valorPago = 100.00;
        double troco = pedido.calcularTroco(valorPago);
        
        System.out.printf("Valor pago: R$%.2f%n", valorPago);
        System.out.printf("Troco: R$%.2f%n", troco);
    }
}