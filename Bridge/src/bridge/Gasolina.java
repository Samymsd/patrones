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
//ImplementorConcretoB
public class Gasolina implements IMotor{

    @Override
    public void InyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + "ml. de gasolina");
    }

    @Override
    public void ConsumirCombustible() {
       RealizarCombustion();
    }
    
    private void RealizarCombustion(){
        System.out.println("Realizar la combustion de la gasolina");
    }
}
