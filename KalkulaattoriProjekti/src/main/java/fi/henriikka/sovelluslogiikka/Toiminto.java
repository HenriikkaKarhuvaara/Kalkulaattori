/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

public abstract class Toiminto {
    
    
    public double tulos;
    public abstract double suoritaToiminto(double x, double y);
    
    
    public double getTulos() {
        return tulos;
    }
    
}