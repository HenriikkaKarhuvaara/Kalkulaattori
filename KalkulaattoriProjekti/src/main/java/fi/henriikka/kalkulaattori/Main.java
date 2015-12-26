package fi.henriikka.kalkulaattori;

import fi.henriikka.sovelluslogiikka.Toiminnot;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
       Toiminnot toiminto = new Toiminnot();
       
       toiminto.summa(3);
       
       System.out.println(toiminto.getTulos());
        
    }
    
}
