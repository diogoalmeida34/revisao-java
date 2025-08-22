/*--------------------------
*****  EXERCICIO 07  ******
----------------------------
Herança de Veiculo: Crie uma classe Veiculo com atributos marca e modelo. Em seguida, crie duas subclasses: Carro (que adiciona numeroDePortas) e Moto (que adiciona cilindradas). Sobrescreva o método toString() em todas as classes para exibir suas informações de forma completa.*/

public class exercicio07 {
    public static void main(String[] args) {
        CarroHer c = new CarroHer("Ford", "Ka", 2018, 4);
        Moto m = new Moto("Honda", "CB300", 2019, 300);
        System.out.println(c);
        System.out.println(m);
    }
}

class VeiculoBase {
    protected String marca;
    protected String modelo;

    public VeiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + "]";
    }
}

class CarroHer extends VeiculoBase {
    private int numeroDePortas;
    public CarroHer(String marca, String modelo, int anoIgnorado, int portas) {
        super(marca, modelo);
        this.numeroDePortas = portas;
    }
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", portas=" + numeroDePortas + "]";
    }
}

class Moto extends VeiculoBase {
    private int cilindradas;
    public Moto(String marca, String modelo, int anoIgnorado, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }
    @Override
    public String toString() {
        return "Moto [marca=" + marca + ", modelo=" + modelo + ", cilindradas=" + cilindradas + "]";
    }
}
