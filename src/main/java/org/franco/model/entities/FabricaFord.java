package org.franco.model.entities;

public class FabricaFord implements FabricaAbstracta{

    private Contador contador;
    private int contraseña = 1234;
    private int caballos = 300;
    private String color = "Rojo";

    public FabricaFord(Contador contador) {
        this.contador = contador;
    }

    public AutoAbs CrearProductoA() {
        return new AutoFord(this.caballos,this.contraseña,this.color,contador.nuevo());
    }

    @Override
    public void CrearProductoB() {

    }

}
