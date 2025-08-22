/*--------------------------
*****  EXERCICIO 01  ******
----------------------------
Calculadora de Média: Escreva um programa que utiliza a classe Scanner para ler 3 notas de um aluno. Calcule e exiba a média aritmética das notas. Em seguida, usando uma estrutura if-else, informe se o aluno foi "Aprovado" (média >= 7), "Recuperação" (média >= 5 e < 7) ou "Reprovado" (média < 5).*/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
