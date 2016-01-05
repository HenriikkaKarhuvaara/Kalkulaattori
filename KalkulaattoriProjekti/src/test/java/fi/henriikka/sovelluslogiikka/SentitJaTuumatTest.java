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
public class SentitJaTuumatTest {

    private SentitJaTuumat st;

    public SentitJaTuumatTest() {
        st = new SentitJaTuumat();
    }

    /**
     * Test of sentitTuumiksi method, of class SentitJaTuumat.
     */
    @Test
    public void sentitTuumiksiToimii() {
        double tulos = st.sentitTuumiksi(2.54);
        assertEquals(1.0, tulos,0.0001);
    }

    /**
     * Test of tuumatSenteiksi method, of class SentitJaTuumat.
     */
    @Test
    public void tuumatSenteiksiToimii() {

        double tulos = st.tuumatSenteiksi(1);
        assertEquals(2.54, tulos,0.0001);

    }

}
