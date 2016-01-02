/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle summa.
 */
package fi.henriikka.sovelluslogiikka;

public class Summa extends Toiminto {

    /**
     * Metodi laskee annettujen parametrien summan, ja palauttaa sen arvon.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Yläluokan Toiminto parametrin tulos arvo, eli käyttäjän
     * syötteiden summa.
     */
    @Override
    public double suoritaToiminto(double x, double y) {
        super.tulos = x + y;
        return super.tulos;
    }

}
