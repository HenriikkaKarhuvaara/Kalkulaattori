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
    private double tulos;

    @Override
    public void run() {
        frame = new JFrame("Kalkulaattori");
        frame.setPreferredSize(new Dimension(400, 250));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

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

//        JButton nolla = new JButton("0");
//        JButton yksi = new JButton("1");
//        JButton kaksi = new JButton("2");
//        JButton kolme = new JButton("3");
//        JButton nelja = new JButton("4");
//        JButton viisi = new JButton("5");
//        JButton kuusi = new JButton("6");
//        JButton seitseman = new JButton("7");
//        JButton kahdeksan = new JButton("8");
//        JButton yhdeksan = new JButton("9");

        tuloskentta.setName("tulos");
        syotekentta.setName("syote");
        toinenSyotekentta.setName("tsyote");
        summa.setName("+");
        erotus.setName("-");
        tulo.setName("*");
        osamaara.setName("/");
        nollaa.setName("C");
//        nolla.setName("0");
//        yksi.setName("1");
//        kaksi.setName("2");
//        kolme.setName("3");
//        nelja.setName("4");
//        viisi.setName("5");
//        kuusi.setName("6");
//        seitseman.setName("7");
//        kahdeksan.setName("8");
//        yhdeksan.setName("9");

       Tapahtumankuuntelija kasittelija = new Tapahtumankuuntelija(//nolla, yksi, kaksi, kolme, nelja, viisi, kuusi,
                                                                   //seitseman, kahdeksan, yhdeksan,
                                                                     summa, erotus, tulo, osamaara, nollaa, tuloskentta, syotekentta, toinenSyotekentta);

//        nolla.addActionListener(kasittelija);
//        yksi.addActionListener(kasittelija);
//        kaksi.addActionListener(kasittelija);
//        kolme.addActionListener(kasittelija);
//        nelja.addActionListener(kasittelija);
//        viisi.addActionListener(kasittelija);
//        kuusi.addActionListener(kasittelija);
//        seitseman.addActionListener(kasittelija);
//        kahdeksan.addActionListener(kasittelija);
//        yhdeksan.addActionListener(kasittelija);

        summa.addActionListener(kasittelija);
        erotus.addActionListener(kasittelija);
        tulo.addActionListener(kasittelija);
        osamaara.addActionListener(kasittelija);
        nollaa.addActionListener(kasittelija);

//        JPanel ekanumeropaneeli = new JPanel(new GridLayout(1, 3));
//        JPanel tokanumeropaneeli = new JPanel(new GridLayout(1, 3));
//        JPanel kolmasnumeropaneeli = new JPanel(new GridLayout(1, 3));
//        JPanel neljasnumeropaneeli = new JPanel(new GridLayout(1, 1));
//        
//        ekanumeropaneeli.add(yksi);
//        ekanumeropaneeli.add(kaksi);
//        ekanumeropaneeli.add(kolme);
//        tokanumeropaneeli.add(nelja);
//        tokanumeropaneeli.add(viisi);
//        tokanumeropaneeli.add(kuusi);
//        kolmasnumeropaneeli.add(seitseman);
//        kolmasnumeropaneeli.add(kahdeksan);
//        kolmasnumeropaneeli.add(yhdeksan);
//        neljasnumeropaneeli.add(nolla);

        JPanel nappulapaneeli = new JPanel(new GridLayout(1,5));
        nappulapaneeli.add(summa);
        nappulapaneeli.add(erotus);
        nappulapaneeli.add(tulo);
        nappulapaneeli.add(osamaara);
        nappulapaneeli.add(nollaa);
        
//        container.add(ekanumeropaneeli);
//        container.add(tokanumeropaneeli);
//        container.add(kolmasnumeropaneeli);
//        container.add(neljasnumeropaneeli);
        
        container.add(nappulapaneeli);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
