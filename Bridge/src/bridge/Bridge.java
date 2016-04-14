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
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IMotor motorDiesel = new Diesel();
        Vehiculo berlina = new Berlina(motorDiesel, 4);
        Vehiculo monovolumen = new Monovolumen(motorDiesel, true);
        
        //berlina.MostrarCaracteristicas();
        monovolumen.MostrarCaracteristicas();
       
    }
    
}
