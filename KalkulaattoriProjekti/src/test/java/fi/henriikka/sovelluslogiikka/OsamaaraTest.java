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

public class OsamaaraTest {
    private Osamaara osamaara;
    
    public OsamaaraTest() {
        osamaara = new Osamaara();
    }
    
    

     @Test
   public void toimiikoJakoNollaan() {
       
       double tulos = osamaara.suoritaToiminto(0,5);
       
       assertEquals(0.0,tulos,0.0001);
   }
   
   @Test
    public void toimiikoJakoNormaalissatapauksessa() {
       
        double tulos = osamaara.suoritaToiminto(15,5);
       
       assertEquals(3.0,tulos,0.0001);
   }
    
   @Test
   public void nollallaEiVoiJakaa() {
       
       osamaara.suoritaToiminto(15,0);
              
       assertEquals(false,osamaara.onnistuikoJako());
   }
   
   @Test
    public void negatiivinenLukujakaaOikein() {
       
      double tulos = osamaara.suoritaToiminto(15,-5);
              
       assertEquals(-3.0,tulos,0.0001);
   }
    
    @Test
    public void jakoToimiiNegatiivisillaLuvuilla() {
        
       double tulos = osamaara.suoritaToiminto(-15,-5);
              
       assertEquals(3.0,tulos,0.0001);
   }
    
    @Test
    public void jakoToimiiKunEiMeneTasan() {
        double tulos = osamaara.suoritaToiminto(15,4);
              
       assertEquals(3.75,tulos,0.0001);
    }
}
