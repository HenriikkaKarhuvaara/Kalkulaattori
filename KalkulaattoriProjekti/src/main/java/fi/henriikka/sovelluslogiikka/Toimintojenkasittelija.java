/*
 * Luokka toimii välikätenä tapahtumankuuntelijalle, ja etsii oikean laskimen toiminnon sen nimen avulla. Lisäksi se tarjoaa metodin 
 * toiminnon suorittamiselle, ja se osaa toteuttaa oikean suorituksen.
 */
package fi.henriikka.sovelluslogiikka;

import java.util.HashMap;

public class Toimintojenkasittelija {

    private HashMap<String, Toiminto> toimintojenKasittelija;
    private Muisti muisti;
    private PaivamaaraLaskuri pvm;

    public Toimintojenkasittelija() {
        luoHashMap();
        muisti = new Muisti();
        pvm = new PaivamaaraLaskuri();
    }

    /**
     * Metodi etsii oikean toiminnon hashMapista, ja toteutta toiminnon
     * suorituksen käyttäjän antamilla arvoilla.
     *
     * @param toiminnonNimi käyttäjän antama syöte
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Oikean toiminnon laskutoimituksen tms. tulos.
     */
    public double suoritaToiminto(String toiminnonNimi, double x, double y) {
        return toimintojenKasittelija.get(toiminnonNimi).suoritaToiminto(x, y);
    }
    
    public String suoritaPaivamaaralaskenta(String x, String y) {
        return pvm.laskePaivamaarienEro(x, y);
    }

    public void lisaaMuistiin(double x) {
        muisti.setVastaus(x);
    }
    

    public double annaViimeisinVastaus() {
        return muisti.getVastaus();
    }

   
    /**
     * Metodi luo hashMapin, johon lisätään laskimen toiminnot.
     *
     */
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

    /**
     * Metodi palauttaa luodun hashMapin.
     *
     * @return luotu hashMap
     */
    public HashMap getHashMap() {
        return toimintojenKasittelija;
    }
}
