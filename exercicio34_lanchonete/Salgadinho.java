class Salgadinho extends Item {
    private String tipo; // frito ou assado
    private String massa;
    private String recheio;
    
    public Salgadinho(double preco, String dataValidade, double peso, 
                     String tipo, String massa, String recheio) {
        super(preco, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMassa() {
        return massa;
    }
    
    public void setMassa(String massa) {
        this.massa = massa;
    }
    
    public String getRecheio() {
        return recheio;
    }
    
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    @Override
    public String toString() {
        return "Salgadinho - " + super.toString() + 
               String.format(", Tipo: %s, Massa: %s, Recheio: %s", 
                           tipo, massa, recheio);
    }
}