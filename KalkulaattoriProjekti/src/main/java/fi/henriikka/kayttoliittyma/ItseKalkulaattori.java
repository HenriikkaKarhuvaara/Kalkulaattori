
package fi.henriikka.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ItseKalkulaattori implements Runnable {
    
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
   
    //Pitäisikö tätä metodia jakaa osiin, vai onko ok käyttöliittymässä?
    private void luoKomponentit(Container container) {
        
        frame.setLayout(new GridLayout(3, 1));
        //Ensimmäinen luku kertoo laskimen rivien määrän, toinen luku kertoo sarakkeiden määrän.
        
        JTextField syotekentta = new JTextField();
        JTextField tuloskentta = new JTextField("0.0");
        tuloskentta.setEnabled(false);
        //Käyttäjä ei pääse käsiksi tuloskentän sisältöön.
       
        container.add(syotekentta);
        container.add(tuloskentta);
        
        JButton summa = new JButton("+");
        JButton erotus = new JButton("-");
        JButton tulo = new JButton("*");
        JButton osamaara = new JButton("/");
        JButton nollaa = new JButton("0");
        
        tuloskentta.setName("tulos");
        syotekentta.setName("syote");
        summa.setName("+");
        erotus.setName("-");
        tulo.setName("*");
        osamaara.setName("/");
        nollaa.setName("0");
        
        Tapahtumankuuntelija kasittelija = new Tapahtumankuuntelija(summa, erotus, tulo, osamaara, nollaa, tuloskentta, syotekentta);
        summa.addActionListener(kasittelija);
        erotus.addActionListener(kasittelija);
        tulo.addActionListener(kasittelija);
        osamaara.addActionListener(kasittelija);
        nollaa.addActionListener(kasittelija);
        
        JPanel paneeli = new JPanel(new GridLayout(1, 5));
        //Ensimmäinen luku kertoo nappulakentän rivien määrän, toinen sarakkeiden määrän.
        paneeli.add(summa);
        paneeli.add(erotus);
        paneeli.add(tulo);
        paneeli.add(osamaara);
        paneeli.add(nollaa);
        container.add(paneeli);
    }
 
    public JFrame getFrame() {
        return frame;
    }
}



