import java.util.List;
import java.util.ArrayList;

class Pedido {
    private String cliente;
    private List<Item> itens;
    private double taxaServico;
    
    public Pedido(String cliente, double taxaServico) {
        this.cliente = cliente;
        this.taxaServico = taxaServico;
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total + (total * taxaServico / 100);
    }
    
    public double calcularTroco(double valorPago) {
        return valorPago - calcularTotal();
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public List<Item> getItens() {
        return itens;
    }
    
    public double getTaxaServico() {
        return taxaServico;
    }
}
