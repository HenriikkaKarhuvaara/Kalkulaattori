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

public class ErotusTest {
    private Erotus erotus;
    
     public ErotusTest() {
        erotus = new Erotus();
    }
    
    @Test
    public void toimiikoErotusNollaan() {
       
       double tulos = erotus.suoritaToiminto(0,3);
              
       assertEquals(-3.0,tulos,0.0001);
   }
    
   @Test
    public void nollanVahennysEiMuutaTulosta() {
       
      double tulos = erotus.suoritaToiminto(3,0);
              
       assertEquals(3.0,tulos,0.0001);
   }
    
   @Test
    public void toimiikoErotusNormaalitapauksessa() {
       
       double tulos = erotus.suoritaToiminto(6,3);
              
       assertEquals(3.0,tulos,0.0001);
   }
    
   @Test
    public void toimiikoErotusNegatiivisellaLuvulla() {
       
       double tulos = erotus.suoritaToiminto(2,-3);
              
       assertEquals(5.0,tulos,0.0001);
   }
    
    @Test
    public void erotusToimiiNegatiivisellaPuolella() {
       
     double tulos = erotus.suoritaToiminto(-20,3);
              
       assertEquals(-23.0,tulos,0.0001);
    }
}
