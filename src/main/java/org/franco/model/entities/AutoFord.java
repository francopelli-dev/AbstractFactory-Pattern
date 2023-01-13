package org.franco.model.entities;

public class AutoFord implements AutoAbs{
    private int caballos;
    private int contraseña;
    private String color;
    private int patente;
    @Override
    public void arrancar(int a) {
        if(this.contraseña==a) {
            System.out.println("Arranco el auto con patente: " + patente);
        }else {
            System.out.println("Contraseña incorrecta en el auto numero "+ this.patente);
        }
    }

    public AutoFord(int caballos, int contraseña, String color, int patente) {
        this.caballos = caballos;
        this.contraseña = contraseña;
        this.color = color;
        this.patente = patente;
    }

    public String toString(){
        return "Auto Ford numero: " + this.patente;
    }
}
