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
public class SentitJaTuumat {
    
    
    public double sentitTuumiksi(double cm) {
        
        double tuumat = cm / 2.54;
        return tuumat;
        
    }
    
    public double tuumatSenteiksi(double inch) {
        
        double sentit = inch * 2.54;
        return sentit;
    }
}
