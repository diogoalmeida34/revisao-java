import java.util.ArrayList;
import java.util.List;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}

class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente: " + nome + ", Nascimento: " + nascimento + ", Código: " + codigo);
    }
}

class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.03;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionário: " + nome + ", Nascimento: " + nascimento + ", Salário: " + salario + ", Imposto: " + calculaImposto());
    }
}

class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.05;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente: " + nome + ", Nascimento: " + nascimento + ", Salário: " + salario + ", Área: " + area + ", Imposto: " + calculaImposto());
    }
}

class CadastroPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();
    private int qtdAtual = 0;

    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        qtdAtual++;
    }

    public void imprimeCadastro() {
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimeDados();
        }
    }
}

public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        
        cadastro.cadastraPessoa(new Cliente("Ricardo", new Data(1, 1, 2000), 101));
        cadastro.cadastraPessoa(new Funcionario("Raquel", new Data(2, 2, 1990), 3000));
        cadastro.cadastraPessoa(new Gerente("Pedro", new Data(3, 3, 1980), 5000, "TI"));
        
        cadastro.imprimeCadastro();
    }
}