/**
 * Luokka tarjoaa metodin nollaustoiminnolle.
 */
package fi.henriikka.sovelluslogiikka;

public class Nollaus extends PerusToiminto {

    /**
     * Metodi asettaa yläluokan Toiminto tuloksen arvoksi nolla, riippumatta
     * käyttäjän syöttämistä arvoista.
     *
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return yläluokan Toiminto parametrin tulos arvo eli nolla.
     */
    @Override
    public double suoritaToiminto(double x, double y) {
        super.tulos = 0;
        return super.tulos;
    }

}
