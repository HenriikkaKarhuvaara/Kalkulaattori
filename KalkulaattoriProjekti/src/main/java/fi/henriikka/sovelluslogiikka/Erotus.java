package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa laskutoimituksen erotus.
 */
public class Erotus extends PerusToiminto {

    /**
     * Metodi laskee annettujen parametrien erotuksen
     * Asettaa yläluokan parametrille tulos tämän arvon
     * Palauttaa sen.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return yläluokan Toiminto parametrin tulos arvo, eli käyttäjän
     * syötteiden erotus
     */
    @Override
    public double suoritaToiminto(double x, double y) {
        tulos = x - y;
        return tulos;
    }

}
