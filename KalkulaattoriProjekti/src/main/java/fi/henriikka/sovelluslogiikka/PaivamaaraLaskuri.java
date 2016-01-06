package fi.henriikka.sovelluslogiikka;

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
    public String laskePaivamaarienEro(String x, String y) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String vastaus = "";

        try {
            Date date1 = myFormat.parse(x);
            Date date2 = myFormat.parse(y);
            long diff = date2.getTime() - date1.getTime();
            vastaus = "Päiviä: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            System.out.println("Päivämäärät väärässä muodossa!");
        }
        return vastaus;

    }
}
