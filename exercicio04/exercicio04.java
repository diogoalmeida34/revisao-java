/*--------------------------
*****  EXERCICIO 04  ******
----------------------------
Soma de Ímpares em um Array: Crie um array de inteiros com números pré-definidos. Utilize um laço for-each para percorrer o array e somar todos os números que forem ímpares. Exiba o resultado final.*/

public class exercicio04 {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 7, 10, 13, 16};
        int soma = 0;
        for (int n : numeros) {
            if (n % 2 != 0) soma += n;
        }
        System.out.println("Soma dos ímpares: " + soma);
    }
}
