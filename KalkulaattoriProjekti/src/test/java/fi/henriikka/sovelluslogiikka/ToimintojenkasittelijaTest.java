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

    public ToimintojenkasittelijaTest() {
        toimintojenKasittelija = new Toimintojenkasittelija();
    }

    @Test
    public void toimiikoLaske() {

        double tulos = toimintojenKasittelija.suoritaToiminto("summa", 2, 3);

        assertEquals(5.0, tulos, 0.0001);
    }

    @Test
    public void hashMapinKokoOikea() {
        assertEquals(5, toimintojenKasittelija.getHashMap().size());
    }

}
