package fi.henriikka.kayttoliittyma;


import fi.henriikka.sovelluslogiikka.Toimintojenkasittelija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumankuuntelija implements ActionListener {

//    private JButton nolla;
//    private JButton yksi;
//    private JButton kaksi;
//    private JButton kolme;
//    private JButton nelja;
//    private JButton viisi;
//    private JButton kuusi;
//    private JButton seitseman;
//    private JButton kahdeksan;
//    private JButton yhdeksan;
    private JButton summa;
    private JButton erotus;
    private JButton tulo;
    private JButton osamaara;
    private JButton nollaa;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private JTextField toinenSyotekentta;
    private Toimintojenkasittelija toimintojenkasittelija;

    public Tapahtumankuuntelija(//JButton nolla, JButton yksi, JButton kaksi, JButton kolme, JButton nelja,
            //JButton viisi, JButton kuusi, JButton seitseman, JButton kahdeksan, JButton yhdeksan, 
            JButton summa, JButton erotus, JButton tulo, JButton osamaara,
            JButton nollaa, JTextField tuloskentta, JTextField syotekentta, JTextField toinenSyotekentta) {

//        this.nolla = nolla;
//        this.yksi = yksi;
//        this.kaksi = kaksi;
//        this.kolme = kolme;
//        this.nelja = nelja;
//        this.viisi = viisi;
//        this.kuusi = kuusi;
//        this.seitseman = seitseman;
//        this.kahdeksan = kahdeksan;
//        this.yhdeksan = yhdeksan;
        this.summa = summa;
        this.erotus = erotus;
        this.tulo = tulo;
        this.osamaara = osamaara;
        this.nollaa = nollaa;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.toinenSyotekentta = toinenSyotekentta;
        this.toimintojenkasittelija = new Toimintojenkasittelija();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double arvo1 = 0;
        double arvo2 = 0;
        double laskunTulos = 0;

        try {
            arvo1 = parseDouble(syotekentta.getText());
            arvo2 = parseDouble(toinenSyotekentta.getText());

        } catch (Exception e) {
            syotekentta.setText("Syötä numero!");
        }

        if (ae.getSource() == summa) {

            laskunTulos = toimintojenkasittelija.laske("summa", arvo1, arvo2);

        } else if (ae.getSource() == erotus) {
            laskunTulos = toimintojenkasittelija.laske("erotus", arvo1, arvo2);
        } else if (ae.getSource() == tulo) {
            laskunTulos = toimintojenkasittelija.laske("tulo", arvo1, arvo2);
        } else if (ae.getSource() == osamaara) {
            laskunTulos = toimintojenkasittelija.laske("osamaara", arvo1, arvo2);
        } else {
            laskunTulos = toimintojenkasittelija.laske("nollaus", arvo1, arvo2);
            syotekentta.setText("");
            toinenSyotekentta.setText("");
        }

        tuloskentta.setText("" + laskunTulos);
    }

}
