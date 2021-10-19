package com.generation.paquete2;

public class Animal {

    //public permite que sea visible desde cualquier lado
    //si no tiene nada se pone por default que permite ver desde la misma clase, y dentro del mismo paquete
    //protected igual que default, pero también de un diferente paquete del que herede
    public String nombre;
    int edad;

    void comer(){
        System.out.println("Ñam ñam!!");
    }
}
