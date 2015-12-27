package fi.henriikka.kalkulaattori;

import fi.henriikka.kayttoliittyma.Kayttoliittyma;
import fi.henriikka.sovelluslogiikka.Toiminnot;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
      SwingUtilities.invokeLater(new Kayttoliittyma());
        
    }
    
}
