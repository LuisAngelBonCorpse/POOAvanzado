package com.generation.banco;

public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getClave(){
        return this.clave;
    }
    public void setClave(String clave){
        this.clave = clave;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
        if (saldo < 0){
            this.saldo = 0;
        }
    }

    public void consultaSaldo(){
        System.out.println("Estimado " + getNombre()  +".\n \nSu saldo es de $"+getSaldo());
    }
}
