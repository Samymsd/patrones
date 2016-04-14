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
public class Monovolumen extends Vehiculo{
    //Atributo propio
    private boolean PuertaCorrediza;

    //La implementacion de los vehículos se desarrolla de forma independiente
    public Monovolumen(IMotor motor, boolean PuertaCorrediza){
        super(motor);
        this.PuertaCorrediza = PuertaCorrediza;
    }
    
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Vehiculo de tipo Monovolumen "+ (PuertaCorrediza ? "con" : "sin") + " puerta corrediza.");
    }
    
}
