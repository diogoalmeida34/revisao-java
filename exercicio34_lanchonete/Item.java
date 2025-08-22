abstract class Item {
    private double preco;
    private String dataValidade;
    private double peso;
    
    public Item(double preco, String dataValidade, double peso) {
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return String.format("Preco: R$%.2f, Validade: %s, Peso: %.2fg", 
                           preco, dataValidade, peso);
    }
}