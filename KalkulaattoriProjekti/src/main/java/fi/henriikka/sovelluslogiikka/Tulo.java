package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle tulo.
 */
public class Tulo extends PerusToiminto {

    /**
     * Metodi laskee annettujen parametrien erotuksen, asettaa yläluokan parametrille tulos tämän arvon ja palauttaa sen.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Yläluokan Toiminto parametrin tulos arvo, eli käyttäjän
     * syötteiden tulo
     */
    @Override
    public double suoritaToiminto(double x, double y) {
        super.tulos = x * y;
        return super.tulos;
    }
}
