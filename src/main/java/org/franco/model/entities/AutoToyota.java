package org.franco.model.entities;

public class AutoToyota implements AutoAbs{

    private int consumo;
    private String color;
    private int patente;
    @Override
    public void arrancar(int a) {
        System.out.println("El auto numero "+this.patente+" arrancó con "+a+" pasajeros");
    }

    public AutoToyota(int consumo, String color, int patente) {
        this.consumo = consumo;
        this.color = color;
        this.patente = patente;
    }
    public String toString(){
        return "Auto Toyota patente: " + this.patente;
    }
}
