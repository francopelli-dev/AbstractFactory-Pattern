package org.franco;

import org.franco.model.entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Abstract Factory con contador para las patentes");
        Contador contador = new Contador();
        FabricaAbstracta factory1 = new FabricaFord(contador);
        FabricaAbstracta factory2 = new FabricaToyota(contador);
        AutoAbs auto1 = factory1.CrearProductoA();
        AutoAbs auto2 = factory2.CrearProductoA();
        AutoAbs auto3 = factory1.CrearProductoA();
        System.out.println(auto1);

        auto1.arrancar(124);
        auto2.arrancar(2);
        auto3.arrancar(1234);

        CamionAbs camion1 = factory1.CrearProductoB();
        camion1.cargar(auto1);
        camion1.cargar(auto2);
        camion1.arrancar();

    }
}