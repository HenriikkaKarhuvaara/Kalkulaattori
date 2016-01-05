/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ToimintojenkasittelijaTest {

    private Toimintojenkasittelija toimintojenKasittelija;
    private Muisti muisti;
    
    public ToimintojenkasittelijaTest() {
        toimintojenKasittelija = new Toimintojenkasittelija();
        muisti = new Muisti();
    }

    @Test
    public void toimiikoSuoritaToiminto() {

        double tulos = toimintojenKasittelija.suoritaPerustoiminto("summa", 2, 3);

        assertEquals(5.0, tulos, 0.0001);
    }

    
    @Test
    public void toimiikoSuoritaPaivamaaraLaskenta() {
       
        String tulos = toimintojenKasittelija.suoritaPaivamaaralaskenta("26 08 1995", "28 08 1995");
        
        assertEquals("Päiviä: 2", tulos);
    }
    
    @Test
    public void toimiikoSentitTuumiksi() {

        double tulos = toimintojenKasittelija.sentitTuumiksi(2.54);

        assertEquals(1.0, tulos, 0.0001);
    }
    
    @Test
    public void toimiikoTuumatSenteiksi() {

        double tulos = toimintojenKasittelija.tuumatSenteiksi(1);

        assertEquals(2.54, tulos, 0.0001);
    }
    
    @Test
    public void toimiikoPaunatKiloiksi() {

        double tulos = toimintojenKasittelija.paunatKiloiksi(2.2046);

        assertEquals(1.0, tulos, 0.0001);
    }
    
    @Test
    public void toimiikoKilotPaunoiksi() {

        double tulos = toimintojenKasittelija.kilotPaunoiksi(1);

        assertEquals(2.2046, tulos, 0.0001);
    }
    
    @Test
    public void hashMapinKokoOikea() {
        assertEquals(5, toimintojenKasittelija.getHashMap().size());
    }

}
