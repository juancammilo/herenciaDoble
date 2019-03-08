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
public abstract class Vehiculo {
    
    protected String marca;
    
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
       
    @Override
    public String toString() {
        return "Vehiculo{" + "marca= " + marca + ", modelo= " + modelo + '}';
    }
    public abstract void tipoVehiculo();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
