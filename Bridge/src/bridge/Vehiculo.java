/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Sandra
 */

//Abstracción
public abstract class Vehiculo {
    private IMotor motor;
    
    public Vehiculo(IMotor motor){
        this.motor = motor;
    }
     
    
    //Encapsulamos la funcionalidad de la interfaz IMotor
    public void Acelerar(double combustible){
        motor.InyectarCombustible(combustible);
        motor.ConsumirCombustible();
    }
    
    public void Frenar(){
        System.out.println("El vehicuo está frenando");
    }
    
    //Método abstracto
    public abstract void MostrarCaracteristicas();
}
