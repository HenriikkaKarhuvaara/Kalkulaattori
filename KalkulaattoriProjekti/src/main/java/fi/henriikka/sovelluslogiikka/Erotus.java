/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle erotus
 */

package fi.henriikka.sovelluslogiikka;

public class Erotus extends PerusToiminto {

    /**
     * Metodi laskee annettujen parametrien erotuksen, ja palauttaa sen arvon.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Yläluokan Toiminto parametrin tulos arvo, eli käyttäjän
     * syötteiden erotus.
     */
    
    @Override
    public double suoritaToiminto(double x, double y) {
        tulos = x - y;
        return tulos;
    }
    
    

}

