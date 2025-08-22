class NotaFiscal {
    private Pedido pedido;
    
    public NotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void gerarNota() {
        System.out.println("=== NOTA FISCAL ===");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("\nItens do pedido:");
        
        for (Item item : pedido.getItens()) {
            System.out.println("- " + item.toString());
        }
        
        System.out.println("\nTaxa de servico: " + pedido.getTaxaServico() + "%");
        System.out.printf("Total: R$%.2f%n", pedido.calcularTotal());
        System.out.println("===================");
    }
}