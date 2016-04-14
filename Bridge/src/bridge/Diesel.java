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
//ImplementorConcretoA
public class Diesel implements IMotor{
    
    @Override
    public void InyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + " ml. de gasolina");
    }

    @Override
    public void ConsumirCombustible() {
        RealizarExplosion();
    }
    
    private void RealizarExplosion(){
        System.out.println("Realizar la explosion de gasolina");
    }
}
