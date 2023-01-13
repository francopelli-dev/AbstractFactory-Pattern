package org.franco.model.entities;

public class Contador {
    private int cuenta;
    public  Contador(){
        cuenta = 0;
    }

    public int getCuenta() {
        return cuenta;
    }
    public int nuevo(){
        this.cuenta++;
        return this.cuenta;
    }
}
