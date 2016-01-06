/**
 * Luokka on abstrakti yläluokka kaikille laskimen perustoiminnoille: 
 * summa, erotus, tulo, osamaara ja nollaus.
 */
package fi.henriikka.sovelluslogiikka;

public abstract class PerusToiminto {

    public double tulos;

    public abstract double suoritaToiminto(double x, double y);

}
