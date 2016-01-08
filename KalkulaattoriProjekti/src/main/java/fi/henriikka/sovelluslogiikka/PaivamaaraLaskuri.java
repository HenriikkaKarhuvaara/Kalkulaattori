package fi.henriikka.sovelluslogiikka;

import fi.henriikka.kayttoliittyma.Tapahtumankuuntelija;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Luokka antaa toiminnallisuuden laskea päivämäärien erotuksia.
 *
 */
public class PaivamaaraLaskuri {

    /**
     * Metodi muuttaa käyttäjän antamat tekstijonot päivämääräolioiksi Laskee
     * päivämäärien erotuksen päivinä Palauttaa vastauksen
     *
     * @param x
     * @param y
     *
     * @return Päivämäärien erotus päivinä
     */
    public double laskePaivamaarienEro(Date x, Date y) {

        double vastaus = 0;

        long diff = y.getTime() - x.getTime();
        vastaus = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        return vastaus;

    }
}
