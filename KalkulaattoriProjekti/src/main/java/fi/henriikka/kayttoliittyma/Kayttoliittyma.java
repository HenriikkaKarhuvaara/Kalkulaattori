/*
 * Luokka luo laskimen graafisen käyttöliittymän.
 */
package fi.henriikka.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
   

    /*
     * Metodi luo kehyksen laskimelle, asettaa sille koon ja sulkuoperaation, sekä luo komponentit ja asettaa ne näkyviksi.
     *
     */
    @Override
    public void run() {
        frame = new JFrame("Kalkulaattori");
        frame.setPreferredSize(new Dimension(400, 250));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }
    
   
    /**
     * Metodi luo laskimen tekstikentät ja nappulat.
     *
     * @param container
     */
    private void luoKomponentit(Container container) {

        frame.setLayout(new GridLayout(4, 1));
        //Ensimmäinen luku kertoo laskimen rivien määrän, toinen luku kertoo sarakkeiden määrän.

        JTextField syotekentta = new JTextField();
        JTextField toinenSyotekentta = new JTextField();
        JTextField tuloskentta = new JTextField();
        tuloskentta.setEnabled(false);
        //Käyttäjä ei pääse käsiksi tuloskentän sisältöön.

        container.add(syotekentta);
        container.add(toinenSyotekentta);
        container.add(tuloskentta);

        JButton summa = new JButton("+");
        JButton erotus = new JButton("-");
        JButton tulo = new JButton("*");
        JButton osamaara = new JButton("/");
        JButton nollaa = new JButton("C");
        JButton viimeisinVastaus = new JButton("A");
        JButton pvm = new JButton("D");

        tuloskentta.setName("tulos");
        syotekentta.setName("syote");
        toinenSyotekentta.setName("tsyote");
        summa.setName("+");
        erotus.setName("-");
        tulo.setName("*");
        osamaara.setName("/");
        nollaa.setName("C");
        viimeisinVastaus.setName("A");
        pvm.setName("D");

        Tapahtumankuuntelija kasittelija = new Tapahtumankuuntelija(
                summa, erotus, tulo, osamaara, nollaa, viimeisinVastaus, pvm,
                tuloskentta, syotekentta, toinenSyotekentta);

        summa.addActionListener(kasittelija);
        erotus.addActionListener(kasittelija);
        tulo.addActionListener(kasittelija);
        osamaara.addActionListener(kasittelija);
        nollaa.addActionListener(kasittelija);
        viimeisinVastaus.addActionListener(kasittelija);
        pvm.addActionListener(kasittelija);

        JPanel nappulapaneeli = new JPanel(new GridLayout(1, 5));
        nappulapaneeli.add(summa);
        nappulapaneeli.add(erotus);
        nappulapaneeli.add(tulo);
        nappulapaneeli.add(osamaara);
        nappulapaneeli.add(nollaa);
        nappulapaneeli.add(viimeisinVastaus);
        nappulapaneeli.add(pvm);

        container.add(nappulapaneeli);
    }

    /**
     * Metodi palauttaa laskimen kehyksen.
     *
     * @return kehys
     */
    public JFrame getFrame() {
        return frame;
    }

}
