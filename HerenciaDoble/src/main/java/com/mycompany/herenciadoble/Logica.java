/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciadoble;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jkammilo
 */
public class Logica {
    
    List<Vehiculo>vehiculo;

    public Logica() {
        Vehiculo bicicleta1 = new Bicicleta(6, "gw", "g6");
        Vehiculo bicicleta2 = new Bicicleta(4, "sahara", "b2");
        
        Vehiculo patineta1 = new Patineta((float)4.0, "flip", "penni");
        Vehiculo patineta2 = new Patineta((float)5.0, "flip", "long");
        
        Vehiculo carro1 = new Carro("5.0 cc", "gasolina", "mazda", "mazda3");
        Vehiculo carro2 = new Carro("2.000 cc", "diesel", "audi", "Q5");
        
        Vehiculo jet1 = new Jet(2, "gasolina", "Gulfstream", "G650");
        Vehiculo jet2 = new Jet(4, "gasolina", "Learjet", "70");
        
        vehiculo = new ArrayList<>();
        
        vehiculo.add(bicicleta1);
        vehiculo.add(bicicleta2);
        vehiculo.add(patineta1);
        vehiculo.add(patineta2);
        vehiculo.add(carro1);
        vehiculo.add(carro2);
        vehiculo.add(jet1);
        vehiculo.add(jet2);
        
        
        for (Vehiculo vehiculo1 : vehiculo) {
            if(vehiculo1 instanceof Bicicleta){
                vehiculo1.tipoVehiculo();
                ((Bicicleta)vehiculo1).mostrarBicicleta();
            }
            else if (vehiculo1 instanceof Patineta){
                vehiculo1.tipoVehiculo();
                ((Patineta)vehiculo1).mostrarPatineta();
            }
            else if (vehiculo1 instanceof Carro){
                vehiculo1.tipoVehiculo();
                ((Carro)vehiculo1).informacion2();
                ((Carro)vehiculo1).mostrarCarro();
            }
            else if (vehiculo1 instanceof Jet){
                vehiculo1.tipoVehiculo();
                ((Jet)vehiculo1).informacion2();
                ((Jet)vehiculo1).mostrarJet();
            }
        }   
    }
}
