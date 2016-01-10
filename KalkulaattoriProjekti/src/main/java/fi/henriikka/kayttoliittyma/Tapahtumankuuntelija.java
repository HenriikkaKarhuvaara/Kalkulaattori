package fi.henriikka.kayttoliittyma;

import fi.henriikka.sovelluslogiikka.Muisti;
import fi.henriikka.sovelluslogiikka.Toimintojenkasittelija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * Luokka yhdistää graafisiin komponentteihin 
 * oikean toiminnallisuuden.
 */
public class Tapahtumankuuntelija implements ActionListener {

    private JButton summa;
    private JButton erotus;
    private JButton tulo;
    private JButton osamaara;
    private JButton nollaa;
    private JButton viimeisinVastaus;
    private JButton pvm;
    private JButton sentitTuumiksi;
    private JButton tuumatSenteiksi;
    private JButton kilotPaunoiksi;
    private JButton paunatKiloiksi;

    private JTextField tuloskentta;
    private JTextField syotekentta;
    private JTextField toinenSyotekentta;
    private Toimintojenkasittelija toimintojenkasittelija;

    public Tapahtumankuuntelija(
            JButton summa, JButton erotus, JButton tulo, JButton osamaara,
            JButton nollaa, JButton viimeisinVastaus, JButton pvm, JButton tuumatSenteiksi, JButton sentitTuumiksi,
            JButton kilotPaunoiksi, JButton paunatKiloiksi,
            JTextField tuloskentta, JTextField syotekentta, JTextField toinenSyotekentta) {

        this.summa = summa;
        this.erotus = erotus;
        this.tulo = tulo;
        this.osamaara = osamaara;
        this.nollaa = nollaa;
        this.viimeisinVastaus = viimeisinVastaus;
        this.pvm = pvm;
        this.tuumatSenteiksi = tuumatSenteiksi;
        this.sentitTuumiksi = sentitTuumiksi;
        this.kilotPaunoiksi = kilotPaunoiksi;
        this.paunatKiloiksi = paunatKiloiksi;

        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.toinenSyotekentta = toinenSyotekentta;

        this.toimintojenkasittelija = new Toimintojenkasittelija();
    }

    /**
     * Metodi selvittää mitä nappulaa on painettu, ja suorittaa siihen liittyvän
     * toiminnallisuuden, lukee käyttäjän syötteitä syötekentistä ja näyttää
     * vastauksen tulokentässä.
     *
     * @param ae Tapahtuma
     *
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        double ans = 0;
        double arvo1 = 0;
        double arvo2 = 0;
        double laskunTulos = 0;
        
        

        if (ae.getSource() == pvm) {

            SimpleDateFormat myFormat = new SimpleDateFormat("dd mm yyyy");
            String x = "" + syotekentta.getText();
            String y = "" + toinenSyotekentta.getText();

            try {
                Date ekapvm = myFormat.parse(x);
                Date tokapvm = myFormat.parse(y);
                laskunTulos = toimintojenkasittelija.suoritaPaivamaaralaskenta(ekapvm, tokapvm);

            } catch (ParseException e) {
                syotekentta.setText("Syötä päivämäärä muodossa - dd mm yyyy!");
            }

            tuloskentta.setText("" + laskunTulos);
            toimintojenkasittelija.lisaaMuistiin(laskunTulos);

        } else if (ae.getSource() == viimeisinVastaus) {

            
            ans = toimintojenkasittelija.annaViimeisinVastaus();
            // nolla, jos mitään ei laskettu

            syotekentta.setText("" + ans);
            toinenSyotekentta.setText("");
            tuloskentta.setText("");

        } else if (ae.getSource() == tuumatSenteiksi) {

            try {
                arvo1 = parseDouble(syotekentta.getText());
            } catch (Exception e) {
                syotekentta.setText("Syötä numero!");
            }

            double sentit = toimintojenkasittelija.tuumatSenteiksi(arvo1);
            tuloskentta.setText("Sentteinä: " + sentit);

        } else if (ae.getSource() == sentitTuumiksi) {

            try {
                arvo1 = parseDouble(syotekentta.getText());
            } catch (Exception e) {
                syotekentta.setText("Syötä numero!");
            }

            double tuumat = toimintojenkasittelija.sentitTuumiksi(arvo1);
            tuloskentta.setText("Tuumina: " + tuumat);

        } else if (ae.getSource() == kilotPaunoiksi) {

            try {
                arvo1 = parseDouble(syotekentta.getText());
            } catch (Exception e) {
                syotekentta.setText("Syötä numero!");
            }

            double paunat = toimintojenkasittelija.kilotPaunoiksi(arvo1);
            tuloskentta.setText("Paunoina: " + paunat);

        } else if (ae.getSource() == paunatKiloiksi) {

            try {
                arvo1 = parseDouble(syotekentta.getText());
            } catch (Exception e) {
                syotekentta.setText("Syötä numero!");
            }

            double kilot = toimintojenkasittelija.paunatKiloiksi(arvo1);
            tuloskentta.setText("Kiloina: " + kilot);

        } else {

            try {
                arvo1 = parseDouble(syotekentta.getText());
                arvo2 = parseDouble(toinenSyotekentta.getText());

            } catch (Exception e) {
                syotekentta.setText("Syötä numero molempiin kenttiin!");
            }

            if (ae.getSource() == summa) {

                laskunTulos = toimintojenkasittelija.suoritaPerustoiminto("summa", arvo1, arvo2);

            } else if (ae.getSource() == erotus) {

                laskunTulos = toimintojenkasittelija.suoritaPerustoiminto("erotus", arvo1, arvo2);

            } else if (ae.getSource() == tulo) {

                laskunTulos = toimintojenkasittelija.suoritaPerustoiminto("tulo", arvo1, arvo2);

            } else if (ae.getSource() == osamaara) {

                laskunTulos = toimintojenkasittelija.suoritaPerustoiminto("osamaara", arvo1, arvo2);

            } else {

                laskunTulos = toimintojenkasittelija.suoritaPerustoiminto("nollaus", arvo1, arvo2);
                syotekentta.setText("");
                toinenSyotekentta.setText("");

            }

            tuloskentta.setText("" + laskunTulos);
            toimintojenkasittelija.lisaaMuistiin(laskunTulos);

        }

    }

}
