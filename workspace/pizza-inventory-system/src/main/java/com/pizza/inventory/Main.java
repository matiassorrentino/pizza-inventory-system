package com.pizza.inventory;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> persona = new ArrayList<>();

        // Añadimos datos

        persona.add("Nombre: María");
        persona.add("Edad: 28 años");
        persona.add("Ocupación: Desarrolladora de software");

        // Mostramos la información
        for (String dato : persona) {
            System.out.println(dato);
        }
    }
}

