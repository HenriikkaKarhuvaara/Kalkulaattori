package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa laskimelle mahdollisuuden tallentaa vastauksen muistiin.
 */
public class Muisti {
    private double vastaus;
    

    public Muisti() {
        vastaus = 0;
    }

/**
 * Asettaa parametrin vastaus arvoksi annetun arvon.
 * 
 * @param x Tallennettavan laskun vastaus
 */
    public void setVastaus(double x) {
        vastaus = x;
    }

/**
 * Palauttaa parametrin vastaus.
 * 
 * @return Parametri tallennettu vastaus
 */
    public double getVastaus() {
        return vastaus;
    }
    
 

}
