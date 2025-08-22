/*--------------------------
*****  EXERCICIO 12  ******
----------------------------
Busca por Elemento: Crie um ArrayList de Strings com nomes de cidades. Peça ao usuário para digitar o nome de uma cidade. Verifique se a cidade está presente na lista usando o método contains(). Se estiver, informe o índice da sua primeira ocorrência usando o método indexOf().*/

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo"); cidades.add("Rio de Janeiro"); cidades.add("Belo Horizonte");
        cidades.add("Curitiba"); cidades.add("Porto Alegre");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String c = sc.nextLine();
        if (cidades.contains(c)) {
            System.out.println("Presente no índice: " + cidades.indexOf(c));
        } else {
            System.out.println("Cidade não encontrada");
        }
        sc.close();
    }
}
