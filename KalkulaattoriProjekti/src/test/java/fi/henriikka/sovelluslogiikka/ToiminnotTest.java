/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

import fi.henriikka.sovelluslogiikka.Toiminnot;
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
public class ToiminnotTest {
    private Toiminnot toiminto;
    
    public ToiminnotTest() {
        toiminto = new Toiminnot();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
   public void toimiikoSummausNollaan() {
       
       this.toiminto.summa(3);
       
       assertEquals(3.0,this.toiminto.getTulos(),0.0001);
   }
   
   @Test
    public void toimiikoSummausNormaalitapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.summa(3);
              
       assertEquals(6.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
   public void nollanLisaysEiMuutaTulosta() {
       
       this.toiminto.setTulos(3);
       this.toiminto.summa(0);
              
       assertEquals(3.0,this.toiminto.getTulos(),0.0001);
   }
   
   @Test
    public void negatiivinenLukuSummautuuOikein() {
       
       this.toiminto.setTulos(6);
       this.toiminto.summa(-3);
              
       assertEquals(3.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
    public void summausToimiiNegatiivisellaPuolella() {
        
       this.toiminto.setTulos(-10);
       this.toiminto.summa(3);
              
       assertEquals(-7.0,this.toiminto.getTulos(),0.0001);
   }
   
    @Test
    public void toimiikoErotusNollaan() {
       
       this.toiminto.erotus(3);
              
       assertEquals(-3.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
    public void nollanVahennysEiMuutaTulosta() {
       
       this.toiminto.setTulos(3);
       this.toiminto.erotus(0);
              
       assertEquals(3.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
    public void toimiikoErotusNormaalitapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.erotus(2);
              
       assertEquals(1.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
    public void toimiikoErotusNegatiivisellaLuvulla() {
       
       this.toiminto.setTulos(6);
       this.toiminto.erotus(-3);
              
       assertEquals(9.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
    public void erotusToimiiNegatiivisellaPuolella() {
       
       this.toiminto.setTulos(-10);
       this.toiminto.erotus(3);
              
       assertEquals(-13.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
   public void toimiikoTuloNollaan() {
       
       this.toiminto.tulo(3);
       
       assertEquals(0.0,this.toiminto.getTulos(),0.0001);
   }
   
   @Test
    public void toimiikoTuloNormaalissatapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.tulo(3);
              
       assertEquals(9.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
   public void nollallaKertominenToimii() {
       
       this.toiminto.setTulos(3);
       this.toiminto.tulo(0);
              
       assertEquals(0.0,this.toiminto.getTulos(),0.0001);
   }
   
   @Test
    public void tuloToimiiNegatiivisellaLuvulla() {
       
       this.toiminto.setTulos(6);
       this.toiminto.tulo(-3);
              
       assertEquals(-18.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
    public void tuloToimiiNegatiivisillaLuvuilla() {
        
       this.toiminto.setTulos(-10);
       this.toiminto.tulo(-3);
              
       assertEquals(30.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
   public void toimiikoJakoNollaan() {
       
       this.toiminto.osamaara(3);
       
       assertEquals(0.0,this.toiminto.getTulos(),0.0001);
   }
   
   @Test
    public void toimiikoJakoNormaalissatapauksessa() {
       
       this.toiminto.setTulos(6);
       this.toiminto.osamaara(3);
              
       assertEquals(2.0,this.toiminto.getTulos(),0.0001);
   }
    
   @Test
   public void nollallaEiVoiJakaa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.osamaara(0);
              
       assertEquals(false,this.toiminto.onnistuikoJako());
   }
   
   @Test
    public void negatiivinenLukujakaaOikein() {
       
       this.toiminto.setTulos(6);
       this.toiminto.osamaara(-3);
              
       assertEquals(-2.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
    public void jakoToimiiNegatiivisillaLuvuilla() {
        
       this.toiminto.setTulos(-9);
       this.toiminto.osamaara(-3);
              
       assertEquals(3.0,this.toiminto.getTulos(),0.0001);
   }
    
    @Test
    public void jakoToimiiKunEiMeneTasan() {
        this.toiminto.setTulos(15);
        this.toiminto.osamaara(4);
        
        assertEquals(3.75,this.toiminto.getTulos(),0.0001);
    }
    
    @Test
    public void laskuToimiiDesimaaliluvuilla() { 
        
        this.toiminto.summa(3.33);
        
        assertEquals(3.33,this.toiminto.getTulos(),0.0001);
    }
    
    @Test
    public void nollausToimii() {
        this.toiminto.setTulos(2);
        this.toiminto.nollaa();
        
        assertEquals(0.0,this.toiminto.getTulos(),0.0001);
    } 
    /**
     * Test of summa method, of class Toiminnot.
     */
}