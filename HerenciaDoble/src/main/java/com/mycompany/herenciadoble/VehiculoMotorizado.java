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
public abstract class VehiculoMotorizado extends Vehiculo{
    
    protected String tipoAlimentacion;

    public VehiculoMotorizado(String tipoAlimentacion, String marca, String modelo) {
        super(marca, modelo);
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    @Override
    public void tipoVehiculo(){
        System.out.println("Tipo vehiculo: vehiculo motorizado");
    }
    
    public abstract void informacion2();

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
