import java.util.ArrayList;
import java.util.List;

class Pizza extends Item {
    private String recheio;
    private String borda;
    private String molho;
    
    public Pizza(double preco, String dataValidade, double peso, 
                String recheio, String borda, String molho) {
        super(preco, dataValidade, peso);
        this.recheio = recheio;
        this.borda = borda;
        this.molho = molho;
    }
    
    public String getRecheio() {
        return recheio;
    }
    
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    public String getBorda() {
        return borda;
    }
    
    public void setBorda(String borda) {
        this.borda = borda;
    }
    
    public String getMolho() {
        return molho;
    }
    
    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    @Override
    public String toString() {
        return "Pizza - " + super.toString() + 
               String.format(", Recheio: %s, Borda: %s, Molho: %s", 
                           recheio, borda, molho);
    }
}
