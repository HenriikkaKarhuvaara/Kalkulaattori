/**
 * Luokka tarjoaa metodin "laske" suorituksen toiminnolle osamaara.
 */
package fi.henriikka.sovelluslogiikka;

public class Osamaara extends PerusToiminto {

    private boolean onnistuikoJako;

    public Osamaara() {
        onnistuikoJako = true;
    }

    /**
     * Metodi laskee annettujen parametrien osamaaran, jos jakaja ei ole nolla,
     * ja palauttaa sen arvon. Jos jakaja on nolla, kertoo metodi, että
     * jakaminen ei onnistu.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Yläluokan Toiminto parametrin tulos arvo, eli käyttäjän
     * syötteiden osamaara.
     */
    @Override
    public double suoritaToiminto(double x, double y) {

        if (y == 0) {
            onnistuikoJako = false;
        } else {
            super.tulos = x / y;
            return super.tulos;
        }
        return 0;
    }

    /**
     * Metodi kertoo, onko jakaminen onnistunut.
     *
     *
     *
     * @return Boolean true tai false sen mukaan, onko jako tehty.
     */
    public boolean onnistuikoJako() {
        return this.onnistuikoJako;
    }
}
