/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author henriikkakarhuvaara
 */
public class PaunatJaKilotTest {
    private PaunatJaKilot pk;
    
    public PaunatJaKilotTest() {
        pk = new PaunatJaKilot();
    }
    
   

    /**
     * Test of paunatKiloiksi method, of class PaunatJaKilot.
     */
    @Test
    public void paunatKiloiksiToimiiNormaalisti() {
       double tulos = pk.paunatKiloiksi(2.2046);
       assertEquals(1.0, tulos,0.0001);
    }

    /**
     * Test of kilotPaunoiksi method, of class PaunatJaKilot.
     */
    @Test
    public void kilotPaunoiksiToimiiNormaalisti() {
        double tulos = pk.kilotPaunoiksi(1);
       assertEquals(2.2046, tulos,0.0001);
    }
    
}
