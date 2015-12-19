

import Kalkulaattori.Toiminnot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ToiminnotTest {
    Toiminnot toiminto;
   
    
    public ToiminnotTest() {
        this.toiminto = new Toiminnot();
        //Luodaan aina testien alussa, joten alkuarvona tulos on nolla.
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
       
       assertEquals(3,this.toiminto.getTulos());
   }
   
   @Test
    public void toimiikoSummausNormaalissatapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.summa(3);
              
       assertEquals(6,this.toiminto.getTulos());
   }
    
   @Test
   public void NollanLisäysEiMuutaTulosta() {
       
       this.toiminto.setTulos(3);
       this.toiminto.summa(0);
              
       assertEquals(3,this.toiminto.getTulos());
   }
   
   @Test
    public void NegatiivinenLukuSummautuuOikein() {
       
       this.toiminto.setTulos(6);
       this.toiminto.summa(-3);
              
       assertEquals(3,this.toiminto.getTulos());
   }
    
    @Test
    public void summausToimiiNegatiivisellaPuolella() {
        
       this.toiminto.setTulos(-10);
       this.toiminto.summa(3);
              
       assertEquals(-7,this.toiminto.getTulos());
   }
   
    @Test
    public void toimiikoErotusNollaan() {
       
       this.toiminto.erotus(3);
              
       assertEquals(-3,this.toiminto.getTulos());
   }
    
   @Test
    public void nollanVahennysEiMuutaTulosta() {
       
       this.toiminto.setTulos(3);
       this.toiminto.erotus(0);
              
       assertEquals(3,this.toiminto.getTulos());
   }
    
   @Test
    public void toimiikoErotusNormaalitapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.erotus(2);
              
       assertEquals(1,this.toiminto.getTulos());
   }
    
   @Test
    public void toimiikoErotusNegatiivisellaLuvulla() {
       
       this.toiminto.setTulos(6);
       this.toiminto.erotus(-3);
              
       assertEquals(9,this.toiminto.getTulos());
   }
    
    @Test
    public void erotusToimiiNegatiivisellaPuolella() {
       
       this.toiminto.setTulos(-10);
       this.toiminto.erotus(3);
              
       assertEquals(-13,this.toiminto.getTulos());
   }
    
    @Test
   public void toimiikoTuloNollaan() {
       
       this.toiminto.tulo(3);
       
       assertEquals(0,this.toiminto.getTulos());
   }
   
   @Test
    public void toimiikoTuloNormaalissatapauksessa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.tulo(3);
              
       assertEquals(9,this.toiminto.getTulos());
   }
    
   @Test
   public void NollallaKertominenToimii() {
       
       this.toiminto.setTulos(3);
       this.toiminto.tulo(0);
              
       assertEquals(0,this.toiminto.getTulos());
   }
   
   @Test
    public void tuloToimiiNegatiivisellaLuvulla() {
       
       this.toiminto.setTulos(6);
       this.toiminto.tulo(-3);
              
       assertEquals(-18,this.toiminto.getTulos());
   }
    
    @Test
    public void tuloToimiiNegatiivisillaLuvuilla() {
        
       this.toiminto.setTulos(-10);
       this.toiminto.tulo(-3);
              
       assertEquals(30,this.toiminto.getTulos());
   }
    
    @Test
   public void toimiikoJakoNollaan() {
       
       this.toiminto.osamaara(3);
       
       assertEquals(0,this.toiminto.getTulos());
   }
   
   @Test
    public void toimiikoJakoNormaalissatapauksessa() {
       
       this.toiminto.setTulos(6);
       this.toiminto.osamaara(3);
              
       assertEquals(2,this.toiminto.getTulos());
   }
    
   @Test
   public void nollallaEiVoiJakaa() {
       
       this.toiminto.setTulos(3);
       this.toiminto.osamaara(0);
              
       assertEquals(false,this.toiminto.onnistuikoJako());
   }
   
   @Test
    public void NegatiivinenLukujakaaOikein() {
       
       this.toiminto.setTulos(6);
       this.toiminto.osamaara(-3);
              
       assertEquals(-2,this.toiminto.getTulos());
   }
    
    @Test
    public void JakoToimiiNegatiivisillaLuvuilla() {
        
       this.toiminto.setTulos(-9);
       this.toiminto.osamaara(-3);
              
       assertEquals(3,this.toiminto.getTulos());
   }
   
    
}
