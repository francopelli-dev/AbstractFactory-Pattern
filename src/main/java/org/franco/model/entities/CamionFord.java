package org.franco.model.entities;

import java.util.ArrayList;
import java.util.List;

public class CamionFord implements CamionAbs{
    private int patente;
    private List<AutoAbs> autos;


    public CamionFord(int patente) {
        this.patente = patente;
        this.autos = new ArrayList<AutoAbs>();
    }

    @Override
    public void arrancar() {
        System.out.println("arranco el camion Ford con patente: "+this.patente+" con los siguientes autos: "+this.autos);

    }

    @Override
    public void cargar(AutoAbs auto) {
        autos.add(auto);
    }
}
