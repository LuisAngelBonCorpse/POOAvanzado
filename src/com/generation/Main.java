package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Luis D");
        cuenta.setClave("Abc-2021");
        cuenta.setSaldo(1000000000);
        cuenta.consultaSaldo();
        System.out.println("Su clave es: " + cuenta.getClave());


        Animal animal = new Animal();
        animal.nombre = "Iguana";
        /*
        Ejemplo de modificador "private":
            Persona persona = new Persona();
            persona.nombre = "Luis";
            persona.edad = 25;
        */
    }
}
