/*--------------------------
*****  EXERCICIO 03  ******
----------------------------
Adivinhe o Número: Gere um número aleatório entre 1 e 100. Peça ao usuário para adivinhar o número. Use um laço while para continuar pedindo um número até que o usuário acerte. A cada tentativa, dê uma dica se o palpite foi "muito alto" ou "muito baixo". No final, informe o número de tentativas.*/

import java.util.Random;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        do {
            System.out.print("Digite seu palpite (1-100): ");
            palpite = sc.nextInt();
            tentativas++;
            if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            }
        } while (palpite != numeroSecreto);
        System.out.println("Parabéns! Acertou em " + tentativas + " tentativas.");
        sc.close();
    }
}
