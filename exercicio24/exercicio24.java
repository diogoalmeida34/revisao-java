/*--------------------------
*****  EXERCICIO 24  ******
----------------------------
Fila de Impressão (Queue): Simule uma fila de impressão. Crie uma Queue (usando LinkedList como implementação) e adicione 5 documentos (Strings com nomes como "Documento1.pdf", "Foto.png", etc.). Em seguida, processe a fila, "imprimindo" (removendo) cada documento e exibindo seu nome na ordem em que entraram.*/

import java.util.LinkedList;
import java.util.Queue;

public class exercicio24 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Documento1.pdf");
        fila.add("Foto.png");
        fila.add("Relatorio.docx");
        fila.add("Planilha.xlsx");
        fila.add("Apresentacao.pptx");
        while (!fila.isEmpty()) {
            String doc = fila.poll();
            System.out.println("Imprimindo: " + doc);
        }
    }
}
