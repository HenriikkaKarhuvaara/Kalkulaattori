/**
 * Luokka on abstrakti yläluokka kaikille laskimen toiminnoille.
 */
package fi.henriikka.sovelluslogiikka;

public abstract class Toiminto {

    public double tulos;

    public abstract double suoritaToiminto(double x, double y);

    /**
     * Metodi kertoo parametrin tulos arvon.
     *
     * @return parametrin tulos arvo.
     */
    public double getTulos() {
        return tulos;
    }

    /**
     * Metodi asettaa parametrille tulos uuden arvon.
     *
     * @param x parametrin tulos uusi arvo.
     */
    public void setTulos(double x) {
        tulos = x;
    }

}
