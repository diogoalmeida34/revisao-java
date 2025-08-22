class Lanche extends Item {
    private String tipoPao;
    private String recheio;
    private String molho;
    
    public Lanche(double preco, String dataValidade, double peso, 
                 String tipoPao, String recheio, String molho) {
        super(preco, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }
    
    public String getTipoPao() {
        return tipoPao;
    }
    
    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }
    
    public String getRecheio() {
        return recheio;
    }
    
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    public String getMolho() {
        return molho;
    }
    
    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    @Override
    public String toString() {
        return "Lanche - " + super.toString() + 
               String.format(", Pao: %s, Recheio: %s, Molho: %s", 
                           tipoPao, recheio, molho);
    }
}
