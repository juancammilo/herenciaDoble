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
public class Bicicleta extends Vehiculo{
    
    private int numeroEngranajes;

    public Bicicleta(int numeroEngranajes, String marca, String modelo) {
        super(marca, modelo);
        this.numeroEngranajes = numeroEngranajes;
    }    
    
    @Override
    public void tipoVehiculo(){
        System.out.println("Tipo vehiculo: Bicicleta");
    }
    
    public void mostrarBicicleta(){
        System.out.println("Bicicleta, numero de engranajes: "+numeroEngranajes+", marca: "+marca+", modelo: "+modelo+".");
    }

    public int getNumeroEngranajes() {
        return numeroEngranajes;
    }

    public void setNumeroEngranajes(int numeroEngranajes) {
        this.numeroEngranajes = numeroEngranajes;
    }
    
}
