/*
 * Luokka tarjoaa toiminnallisuuden laskimen nappuloille.
 */
package fi.henriikka.kayttoliittyma;

import fi.henriikka.sovelluslogiikka.Muisti;
import fi.henriikka.sovelluslogiikka.Toimintojenkasittelija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumankuuntelija implements ActionListener {

    private JButton summa;
    private JButton erotus;
    private JButton tulo;
    private JButton osamaara;
    private JButton nollaa;
    private JButton viimeisinVastaus;
    private JButton pvm;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private JTextField toinenSyotekentta;
    private Toimintojenkasittelija toimintojenkasittelija;

    public Tapahtumankuuntelija(
            JButton summa, JButton erotus, JButton tulo, JButton osamaara,
            JButton nollaa, JButton viimeisinVastaus, JButton pvm,
            JTextField tuloskentta, JTextField syotekentta, JTextField toinenSyotekentta) {

        this.summa = summa;
        this.erotus = erotus;
        this.tulo = tulo;
        this.osamaara = osamaara;
        this.nollaa = nollaa;
        this.viimeisinVastaus = viimeisinVastaus;
        this.pvm = pvm;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.toinenSyotekentta = toinenSyotekentta;

        this.toimintojenkasittelija = new Toimintojenkasittelija();
    }

    /**
     * Metodi käy läpi mahdolliset tapahtumakulut.
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
        String ekapvm = "";
        String tokapvm = "";
        String tulos = "";

        if (ae.getSource() == pvm) {

            ekapvm = "" + syotekentta.getText();
            tokapvm = "" + toinenSyotekentta.getText();

            tulos = toimintojenkasittelija.suoritaPaivamaaralaskenta(ekapvm, tokapvm);

            tuloskentta.setText(tulos);

        } else if (ae.getSource() == viimeisinVastaus) {

            ans = toimintojenkasittelija.annaViimeisinVastaus();
               // nolla, jos mitään ei laskettu
            
            syotekentta.setText("" + ans);
            toinenSyotekentta.setText("");
            tuloskentta.setText("");

        } else {

            try {
                arvo1 = parseDouble(syotekentta.getText());
                arvo2 = parseDouble(toinenSyotekentta.getText());

            } catch (Exception e) {
                syotekentta.setText("Syötä numero molempiin kenttiin!");
            }

            if (ae.getSource() == summa) {

                laskunTulos = toimintojenkasittelija.suoritaToiminto("summa", arvo1, arvo2);

            } else if (ae.getSource() == erotus) {

                laskunTulos = toimintojenkasittelija.suoritaToiminto("erotus", arvo1, arvo2);

            } else if (ae.getSource() == tulo) {

                laskunTulos = toimintojenkasittelija.suoritaToiminto("tulo", arvo1, arvo2);

            } else if (ae.getSource() == osamaara) {

                laskunTulos = toimintojenkasittelija.suoritaToiminto("osamaara", arvo1, arvo2);

            } else {

                laskunTulos = toimintojenkasittelija.suoritaToiminto("nollaus", arvo1, arvo2);
                syotekentta.setText("");
                toinenSyotekentta.setText("");

            }
            tuloskentta.setText("" + laskunTulos);
            toimintojenkasittelija.lisaaMuistiin(laskunTulos);

        }

    }

}
