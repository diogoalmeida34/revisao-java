/*--------------------------
*****  EXERCICIO 02  ******
----------------------------
Tabuada com for: Peça ao usuário um número inteiro. Use um laço for tradicional para calcular e exibir a tabuada de multiplicação desse número, do 1 ao 10. (Ex: "5 x 1 = 5", "5 x 2 = 10", ...).*/

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
