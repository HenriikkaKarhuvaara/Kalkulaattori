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
public class PaivamaaraLaskuriTest {

    private PaivamaaraLaskuri laskuri;

    public PaivamaaraLaskuriTest() {
        laskuri = new PaivamaaraLaskuri();
    }

    @Test
    public void toimiikoLaskePaivamaarienEro() {
        String tulos = laskuri.laskePaivamaarienEro("26 08 1995", "28 08 1995");

        assertEquals("Päiviä: 2", tulos);
    }

}
