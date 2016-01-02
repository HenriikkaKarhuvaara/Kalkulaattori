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
public class TuloTest {

    private Tulo tulo;

    public TuloTest() {
        tulo = new Tulo();
    }

    @Test
    public void toimiikoTuloNollaan() {

        double tulos = tulo.suoritaToiminto(0, 2);

        assertEquals(0.0, tulos, 0.0001);
    }

    @Test
    public void toimiikoTuloNormaalissatapauksessa() {

        double tulos = tulo.suoritaToiminto(3, 2);

        assertEquals(6.0, tulos, 0.0001);

    }

    @Test
    public void nollallaKertominenToimii() {

        double tulos = tulo.suoritaToiminto(2, 0);

        assertEquals(0.0, tulos, 0.0001);
    }

    @Test
    public void tuloToimiiNegatiivisellaLuvulla() {

        double tulos = tulo.suoritaToiminto(3, -2);

        assertEquals(-6.0, tulos, 0.0001);
    }

    @Test
    public void tuloToimiiNegatiivisillaLuvuilla() {

        double tulos = tulo.suoritaToiminto(-4, -2);

        assertEquals(8.0, tulos, 0.0001);
    }

}
