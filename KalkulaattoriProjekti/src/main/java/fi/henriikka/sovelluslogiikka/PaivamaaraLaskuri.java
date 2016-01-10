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

    private double vastaus;

    /**
     * Metodi laskee
     * päivämäärien erotuksen päivinä ja palauttaa vastauksen.
     *
     * @param x ensimmäinen päivämäärä
     * @param y toinen päivämäärä
     *
     * @return Päivämäärien erotus päivinä
     */
    public double laskePaivamaarienEro(Date x, Date y) {

        long diff = y.getTime() - x.getTime();
        vastaus = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        return vastaus;

    }
}
