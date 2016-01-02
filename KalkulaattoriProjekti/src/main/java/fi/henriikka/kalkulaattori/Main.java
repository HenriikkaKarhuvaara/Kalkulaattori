package fi.henriikka.kalkulaattori;

import fi.henriikka.kayttoliittyma.Kayttoliittyma;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
      SwingUtilities.invokeLater(new Kayttoliittyma());
        
    }
    
}
