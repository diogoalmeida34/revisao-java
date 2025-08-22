/*--------------------------
*****  EXERCICIO 29  ******
----------------------------
Histórico de Navegação: Use uma LinkedList para simular o histórico de um navegador. Crie métodos visitar(String url), voltar() e avancar(). O método voltar deve navegar para a URL anterior no histórico, e o avancar para a próxima, gerenciando o índice da página atual.*/

import java.util.LinkedList;

public class exercicio29 {
    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visitar("a.com"); bh.visitar("b.com"); bh.visitar("c.com");
        System.out.println("Atual: " + bh.getAtual());
        bh.voltar();
        System.out.println("Depois de voltar: " + bh.getAtual());
        bh.avancar();
        System.out.println("Depois de avançar: " + bh.getAtual());
    }
}

class BrowserHistory {
    private LinkedList<String> history = new LinkedList<>();
    private int idx = -1;
    public void visitar(String url) {
        while (history.size() > idx+1) history.removeLast();
        history.add(url); idx++;
    }
    public void voltar() { if (idx > 0) idx--; }
    public void avancar() { if (idx < history.size()-1) idx++; }
    public String getAtual() { if (idx >=0) return history.get(idx); else return null; }
}
