/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle tulo.
 */
package fi.henriikka.sovelluslogiikka;

public class Tulo extends PerusToiminto {

    /**
     * Metodi laskee annettujen parametrien tulon, ja palauttaa sen arvon.
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
