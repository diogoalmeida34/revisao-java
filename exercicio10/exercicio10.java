/*--------------------------
*****  EXERCICIO 10  ******
----------------------------
Ordenando Números: Crie um ArrayList de Integer. Adicione 10 números inteiros aleatórios ou definidos por você. Utilize a classe Collections e seu método sort() para ordenar a lista em ordem crescente e, em seguida, exiba o resultado.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) nums.add(r.nextInt(100));
        System.out.println("Antes: " + nums);
        Collections.sort(nums);
        System.out.println("Depois (crescente): " + nums);
    }
}
