package fi.henriikka.kalkulaattori;

import fi.henriikka.kayttoliittyma.Kayttoliittyma;
import fi.henriikka.sovelluslogiikka.Muisti;
import fi.henriikka.sovelluslogiikka.PaivamaaraLaskuri;
import fi.henriikka.sovelluslogiikka.Toimintojenkasittelija;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Kayttoliittyma());
//PaivamaaraLaskuri o = new PaivamaaraLaskuri();
//o.laskePaivamaarienEro("26 08 1995", "04 01 2016");
    }

}
