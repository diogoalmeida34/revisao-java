package atividade31;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalisadordeClasse {

    public static void inspecionar(Object obj) {
        Class<?> classe = obj.getClass();

        System.out.println("Classe: " + classe.getName());

        Field[] campos = classe.getDeclaredFields();
        System.out.println("\nAtributos:");
        for (Field campo : campos) {
            System.out.println("- " + campo.getName() + " (" + campo.getType().getSimpleName() + ")");
        }

        Method[] metodos = classe.getDeclaredMethods();
        System.out.println("\nMetodos:");
        for (Method metodo : metodos) {
            System.out.println("- " + metodo.getName());
        }
    }
}
