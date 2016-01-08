/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.assertj.swing.dependency.fest_util.Dates.today;
import static org.fest.util.Dates.today;
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
    Date ekapvm;
    Date tokapvm;

    public PaivamaaraLaskuriTest() {
        laskuri = new PaivamaaraLaskuri();

    }

    @Test
    public void toimiikoLaskePaivamaarienEro() {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd mm yyyy");
        String x = "26 08 1995";
        String y = "27 08 1995";

        try {
             ekapvm = myFormat.parse(x);
             tokapvm = myFormat.parse(y);
        } catch (ParseException e) {
            System.out.println("Päivämäärälaskurin testaus ei onnistunut.");
        }

        double tulos = laskuri.laskePaivamaarienEro(ekapvm, tokapvm);
        assertEquals(1.0, tulos, 0.0001);
    }

}
