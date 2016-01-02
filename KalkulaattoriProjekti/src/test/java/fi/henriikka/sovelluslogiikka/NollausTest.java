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

public class NollausTest {

    private Nollaus nollaus;

    public NollausTest() {
        nollaus = new Nollaus();
    }

    @Test
    public void nollausToimii() {

        double tulos = nollaus.suoritaToiminto(3, 2);
        
        assertEquals(0.0, tulos, 0.0001);
    }
}
