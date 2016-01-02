/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.kayttoliittyma;

import fi.henriikka.kalkulaattori.Main;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.assertj.swing.core.GenericTypeMatcher;
import static org.assertj.swing.finder.WindowFinder.findFrame;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import static org.assertj.swing.launcher.ApplicationLauncher.application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KayttoliittymaTest extends AssertJSwingJUnitTestCase{
    FrameFixture window;
    Frame frame;
    
   
    
    
    @Test
    public void summaNappulaToimii() {
        window.textBox("syote").setText("3");
        window.textBox("tsyote").setText("3");
        window.button("+").click();
        window.textBox("tulos").requireText("6.0");
    }
    
    @Test
    public void erotusNappulaToimii() {
        window.textBox("syote").setText("3");
        window.textBox("tsyote").setText("2");
        window.button("-").click();
        window.textBox("tulos").requireText("1.0");
    }
    
    @Test
    public void tuloNappulaToimii() {
        window.textBox("syote").setText("3");
        window.textBox("tsyote").setText("3");
        window.button("*").click();
        window.textBox("tulos").requireText("9.0");
    }
    
    @Test 
    public void osamaaraNappulaToimii() {
        window.textBox("syote").setText("40");
        window.textBox("tsyote").setText("2");
        window.button("/").click();
        window.textBox("tulos").requireText("20.0");
    }
  
    @Test
    public void osamaaraNappulaEiAnnaJakaaNollalla() {
        window.textBox("syote").setText("40");
        window.button("/").click();
         window.textBox("tulos").requireText("0.0");
    }
    
    
    @Test
    public void nollaaNappulaToimii() {
        window.textBox("syote").setText("3");
        window.textBox("tsyote").setText("3");
        window.button("+").click();
        window.button("C").click();
        window.textBox("syote").requireText("");
        window.textBox("tsyote").requireText("");
        window.textBox("tulos").requireText("0.0");
    }
    
    @Test
    public void oikeanKokoinenFrame() {
        Dimension laskimenKoko = new Dimension(400,250);
        window.requireSize(laskimenKoko);
    }
    
    @Test
    public void tulosKenttaaEiVoiMuokata() {
        window.textBox("tulos").requireDisabled();
    }
    
   
    @Test
    public void laskinNakyyKayttajalle() {
        window.requireVisible();
    }
    
    @Test
    public void laskinToimiiOikeinKunKayttajaSyottaaMuunKuinNumeron() {
        window.textBox("syote").setText("Moi");
        window.button("+").click();
        window.textBox("syote").requireText("Syötä numero!");
    }
     
    
    @Override
    protected void onSetUp() {
        application(Main.class).start();

        window = findFrame(new GenericTypeMatcher<Frame>(Frame.class) {
            protected boolean isMatching(Frame frame) {
                return frame.isShowing();
            }
        }).using(robot());  
    }
    
}