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
public class Carro extends VehiculoMotorizado {
    
    private String tamañoMotor;

    public Carro(String tamañoMotor, String tipoAlimentacion, String marca, String modelo) {
        super(tipoAlimentacion, marca, modelo);
        this.tamañoMotor = tamañoMotor;
    }
   
   @Override
   public void tipoVehiculo(){
       System.out.println("Soy tipo: Carro");
   }
   
   @Override
   public void informacion2(){
       System.out.println("Soy hijo de vehiculo motorizado, tipo carro");
   }
   
   public void mostrarCarro(){
       System.out.println("Carro, tamaño motor"+tamañoMotor+", tipo de alimentacion: "+tipoAlimentacion+", marca: "+marca+", modelo: "+modelo+".");
   }
    public String getTamañoMotor() {
        return tamañoMotor;
    }

    public void setTamañoMotor(String tamañoMotor) {
        this.tamañoMotor = tamañoMotor;
    }
}
