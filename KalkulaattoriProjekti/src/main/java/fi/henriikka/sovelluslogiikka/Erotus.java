/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

public class Erotus extends Toiminto {

    @Override
    public double suoritaToiminto(double x, double y) {
        tulos = x - y;
        return tulos;
    }
    
    

}

