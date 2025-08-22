public class MinhaClasseDeTeste {

    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este nao e um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}
