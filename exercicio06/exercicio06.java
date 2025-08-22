/*--------------------------
*****  EXERCICIO 06  ******
----------------------------
Classe Circulo com Encapsulamento: Crie uma classe Circulo com um atributo privado raio (double). Crie um construtor e os métodos getRaio e setRaio. No setRaio, adicione uma validação para garantir que o raio nunca seja um valor negativo ou zero (lance uma IllegalArgumentException se a condição não for atendida). Crie também um método calcularArea() que retorna a área do círculo (pi * raioˆ2).*/

public class exercicio06 {
    public static void main(String[] args) {
        try {
            Circulo c = new Circulo(2.5);
            System.out.printf("Raio: %.2f, Área: %.4f%n", c.getRaio(), c.calcularArea());
            c.setRaio(0); // força exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() { return raio; }

    public void setRaio(double raio) {
        if (raio <= 0) throw new IllegalArgumentException("Raio deve ser > 0");
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
