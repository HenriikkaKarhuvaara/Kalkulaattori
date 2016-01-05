/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

/**
 *
 * @author henriikkakarhuvaara
 */
public class PaunatJaKilot {
    
    
    
    public double paunatKiloiksi(double pounds){
        
        double kilot = pounds / 2.2046;
        return kilot;
        
    }
    
    public double kilotPaunoiksi(double kilot) {
        
        double paunat = kilot * 2.2046;
        return paunat;
    }
}
