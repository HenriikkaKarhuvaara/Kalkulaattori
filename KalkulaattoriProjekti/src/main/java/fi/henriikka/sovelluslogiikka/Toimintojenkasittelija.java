/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

import java.util.HashMap;

public class Toimintojenkasittelija {

    public HashMap<String, Toiminto> toimintojenKasittelija;
    
    public Toimintojenkasittelija() {
        luoHashMap();
    }

    public double laske(String toiminnonNimi, double x, double y) {

        return toimintojenKasittelija.get(toiminnonNimi).suoritaToiminto(x,y);

    }

    private void luoHashMap() {

        toimintojenKasittelija = new HashMap<>();

        
        Summa s = new Summa();
        Erotus e = new Erotus();
        Tulo t = new Tulo();
        Osamaara o = new Osamaara();
        Nollaus n = new Nollaus();

        toimintojenKasittelija.put("summa", s);
        toimintojenKasittelija.put("erotus", e);
        toimintojenKasittelija.put("tulo", t);
        toimintojenKasittelija.put("osamaara", o);
        toimintojenKasittelija.put("nollaus", n);
    }
    
   public HashMap getHashMap() {
       return toimintojenKasittelija;
   }
}

