package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle summa.
 */
public class Summa extends PerusToiminto {

    /**
     * Metodi laskee annettujen parametrien summan
     * Asettaa yläluokan parametrille tulos tämän arvon
     * Palauttaa sen.
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
