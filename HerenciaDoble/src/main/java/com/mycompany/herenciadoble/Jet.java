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
public class Jet extends VehiculoMotorizado{
    
    private int numeroMotores;

    public Jet(int numeroMotores, String tipoAlimentacion, String marca, String modelo) {
        super(tipoAlimentacion, marca, modelo);
        this.numeroMotores = numeroMotores;
    }
    
    @Override
    public void tipoVehiculo(){
        System.out.println("Soy tipo:  Jet");
    }
    
    @Override
    public void informacion2(){
        System.out.println("Soy hijo de vehiculo motorizado, tipo jet");
    }

    public void mostrarJet(){
        System.out.println("Jet, numero de motores: "+numeroMotores+", tipo de alimentacion: "+tipoAlimentacion+", marca: "+marca+", modelo: "+modelo+".");
    }
    
    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    
}
