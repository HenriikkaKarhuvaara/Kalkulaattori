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
public class SummaTest {
    private Summa summa;
    
    public SummaTest() {
        summa = new Summa();
    }
    
     @Test
   public void toimiikoSummausNollaan() {
       
       double tulos = summa.suoritaToiminto(0, 3);
       
       assertEquals(3.0,tulos,0.0001);
   }
   
   @Test
    public void toimiikoSummausNormaalitapauksessa() {
       
       double tulos = summa.suoritaToiminto(3, 3);
       
       assertEquals(6.0,tulos,0.0001);
   }
    
   @Test
   public void nollanLisaysEiMuutaTulosta() {
       
       double tulos = summa.suoritaToiminto(3, 0);
       
       assertEquals(3.0,tulos,0.0001);
   }
   
   @Test
    public void negatiivinenLukuSummautuuOikein() {
       
       double tulos = summa.suoritaToiminto(0, -3);
       
       assertEquals(-3.0,tulos,0.0001);
   }
    
    @Test
    public void summausToimiiNegatiivisellaPuolella() {
        
       double tulos = summa.suoritaToiminto(-10, 3);
       
       assertEquals(-7.0,tulos,0.0001);
   }
    
}
