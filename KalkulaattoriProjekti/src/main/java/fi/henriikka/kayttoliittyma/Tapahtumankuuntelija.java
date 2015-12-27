
 
package fi.henriikka.kayttoliittyma;

import fi.henriikka.sovelluslogiikka.Toiminnot;
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
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Toiminnot toiminnot;
 
    public Tapahtumankuuntelija(JButton summa, JButton erotus, JButton tulo, JButton osamaara, 
                                JButton nollaa, JTextField tuloskentta, JTextField syotekentta) { 
                                // Pitääkö nimeonmaan tässä olla parametrit?
        
        this.summa = summa;
        this.erotus = erotus;
        this.tulo = tulo;
        this.osamaara = osamaara;
        this.nollaa = nollaa;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.toiminnot = new Toiminnot();
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        double arvo = 0;
 
        try {
            arvo = parseDouble(syotekentta.getText());
        } catch (Exception e) {
        }
 
        if (ae.getSource() == summa) {
            toiminnot.summa(arvo);
        } else if (ae.getSource() == erotus) {
            toiminnot.erotus(arvo);
        } else if (ae.getSource() == tulo) {
            toiminnot.tulo(arvo);
        } else if (ae.getSource() == osamaara) {
            toiminnot.osamaara(arvo);    
        } else {
            toiminnot.nollaa();
        }
        
        double laskunTulos = toiminnot.getTulos();
        tuloskentta.setText("" + laskunTulos);
       
    }
 
}



