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

//RefinamientoAbstraccionA
public class Berlina extends Vehiculo{
    //Atributo propio
    private int CapacidadMaletero;
    
    //La implementación de los vehículos se desarrolla de forma independiente
    public Berlina(IMotor motor, int CapacidadMaletero){
        super(motor);
        this.CapacidadMaletero = CapacidadMaletero;
    }
    
    // Implementación del método abstracto   
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Vehiculo de tipo Berlina con una capacidad de " + CapacidadMaletero + " litros");
    }
    
    
}
