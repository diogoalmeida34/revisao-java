import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Sistema VcRiquinho ===");
            System.out.println("1 - Gerenciar Clientes");
            System.out.println("2 - Gerenciar Produtos");
            System.out.println("3 - Simular Rendimentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: menuClientes(); break;
                case 2: menuProdutos(); break;
                case 3: simularRendimentos(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opcao invalida!");
            }
        }
    }

    // ---------------- MENU CLIENTES ----------------
    private static void menuClientes() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- Gerenciar Clientes ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrarCliente(); break;
                case 2: listarClientes(); break;
                case 3: atualizarCliente(); break;
                case 4: removerCliente(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!");
            }
        }
    }

    // ---------------- MENU PRODUTOS ----------------
    private static void menuProdutos() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- Gerenciar Produtos ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrarProduto(); break;
                case 2: listarProdutos(); break;
                case 3: atualizarProduto(); break;
                case 4: removerProduto(); break;
                case 0: break;
                default: System.out.println("Opcao invalida!");
            }
        }
    }

    // ---------------- SIMULAÇÃO ----------------
    private static void simularRendimentos() {
        System.out.println("\n--- Simulacao de Rendimentos ---");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }
        listarClientes();
        System.out.print("Escolha o indice do cliente: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= clientes.size()) {
            System.out.println("Cliente invalido!");
            return;
        }

        Cliente cliente = clientes.get(idx);
        if (cliente.getContas().isEmpty()) {
            System.out.println("Este cliente nao possui contas!");
            return;
        }

        System.out.println("Escolha o periodo (30, 60, 90, 180 dias): ");
        int dias = sc.nextInt();

        for (Conta conta : cliente.getContas()) {
            double rendimento = conta.calcularRendimento(dias);
            System.out.println("Conta: " + conta.getClass().getSimpleName() +
                               " | Rendimento em " + dias + " dias: R$ " + rendimento);
        }
    }

    private static void cadastrarCliente() {
        System.out.println("Cadastrar PF ou PJ? (1=PF, 2=PJ)");
        int tipo = sc.nextInt(); sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        if (tipo == 1) {
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            clientes.add(new PessoaFisica(nome, email, cpf));
        } else {
            System.out.print("CNPJ: ");
            String cnpj = sc.nextLine();
            clientes.add(new PessoaJuridica(nome, email, cnpj));
        }
        System.out.println("Cliente cadastrado!");
    }

    private static void listarClientes() {
        if(clientes.size() == 0){
            System.out.println("Nao ha clientes registrados...");
        } else{
            for (int i = 0; i < clientes.size(); i++) {
                Cliente c = clientes.get(i);
                System.out.println(i + " - " + c.nome + " (" + c.getClass().getSimpleName() + ")");
            }
        }
    }

    private static void atualizarCliente() {
        listarClientes();
        System.out.print("Digite o indice do cliente: ");
        int idx = sc.nextInt(); sc.nextLine();
        if (idx < 0 || idx >= clientes.size()) {
            System.out.println("Invalido!");
            return;
        }
        Cliente c = clientes.get(idx);
        System.out.print("Novo email: ");
        String email = sc.nextLine();
        c.email = email;
        System.out.println("Atualizado!");
    }

    private static void removerCliente() {
        listarClientes();
        System.out.print("Digite o indice do cliente: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < clientes.size()) {
            clientes.remove(idx);
            System.out.println("Cliente removido!");
        }
    }

    private static void cadastrarProduto() {
        System.out.println("Cadastrar Renda Fixa (1) ou Renda Variavel (2)? ");
        int tipo = sc.nextInt(); sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Descricao: ");
        String desc = sc.nextLine();

        if (tipo == 1) {
            System.out.print("Rendimento Mensal (%): ");
            double rend = sc.nextDouble() / 100;
            System.out.print("Carencia (dias): ");
            int carencia = sc.nextInt();
            produtos.add(new RendaFixa(nome, desc, rend, carencia));
        } else {
            System.out.print("Rendimento Mensal Esperado (%): ");
            double rend = sc.nextDouble() / 100;
            produtos.add(new RendaVariavel(nome, desc, rend));
        }
        System.out.println("Produto cadastrado!");
    }

    private static void listarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println(i + " - " + p.nome + " (" + p.getClass().getSimpleName() + ")");
        }
    }

    private static void atualizarProduto() {
        listarProdutos();
        System.out.print("Digite o indice do produto: ");
        int idx = sc.nextInt(); sc.nextLine();
        if (idx < 0 || idx >= produtos.size()) {
            System.out.println("Invalido!");
            return;
        }
        Produto p = produtos.get(idx);
        System.out.print("Nova descricao: ");
        String desc = sc.nextLine();
        p.descricao = desc;
        System.out.println("Atualizado!");
    }

    private static void removerProduto() {
        listarProdutos();
        System.out.print("Digite o indice do produto: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < produtos.size()) {
            produtos.remove(idx);
            System.out.println("Produto removido!");
        }
    }
}
