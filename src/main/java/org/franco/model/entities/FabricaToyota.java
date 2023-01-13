package org.franco.model.entities;

public class FabricaToyota implements FabricaAbstracta{

    private int consumo = 300;
    private int caballo  = 200;
    private String color = "Azul";
    private Contador contador;


    public FabricaToyota(Contador contador) {
        this.contador = contador;
    }
    @Override
    public AutoAbs CrearProductoA() {
        return new AutoToyota(this.consumo,this.color,this.contador.nuevo());
    }

    @Override
    public CamionAbs CrearProductoB() {
        return null;
    }
}
