/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciadoble;

/**
 *
 * @author Jkammilo
 */
public class Patineta extends Vehiculo{
    
    private float tamaño;

    public Patineta(float tamaño, String marca, String modelo) {
        super(marca, modelo);
        this.tamaño = tamaño;
    }
    
    @Override
    public void tipoVehiculo(){
        System.out.println("Tipo de vehiculo: patineta");
    }
    
    public void mostrarPatineta(){
        System.out.println("Patineta, tamaño: "+tamaño+", marca: "+marca+", modelo: "+modelo+".");
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    
}
