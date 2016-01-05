/*
 * Luokka toimii välikätenä tapahtumankuuntelijalle, ja etsii oikean laskimen toiminnon sen nimen avulla. Lisäksi se tarjoaa metodin 
 * toiminnon suorittamiselle, ja se osaa toteuttaa oikean suorituksen.
 */
package fi.henriikka.sovelluslogiikka;

import java.util.HashMap;

public class Toimintojenkasittelija {

    private HashMap<String, PerusToiminto> perustoimintojenKasittelija;
    private Muisti muisti;
    private PaivamaaraLaskuri pvm;
    private SentitJaTuumat sjt;
    private PaunatJaKilot pjk;

    public Toimintojenkasittelija() {
        luoHashMap();
        muisti = new Muisti();
        pvm = new PaivamaaraLaskuri();
        sjt = new SentitJaTuumat();
        pjk = new PaunatJaKilot();
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
    public double suoritaPerustoiminto(String toiminnonNimi, double x, double y) {
        return perustoimintojenKasittelija.get(toiminnonNimi).suoritaToiminto(x, y);
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
    
    public double sentitTuumiksi(double cm) {
        return sjt.sentitTuumiksi(cm);
    }
    
    public double tuumatSenteiksi(double inch) {
        return sjt.tuumatSenteiksi(inch);
    }
    
     public double paunatKiloiksi(double pounds){
        return pjk.paunatKiloiksi(pounds) ;
    }
    
    public double kilotPaunoiksi(double kilot) {
        return pjk.kilotPaunoiksi(kilot);
    }

   
    /**
     * Metodi luo hashMapin, johon lisätään laskimen toiminnot.
     *
     */
    private void luoHashMap() {

        perustoimintojenKasittelija = new HashMap<>();

        Summa s = new Summa();
        Erotus e = new Erotus();
        Tulo t = new Tulo();
        Osamaara o = new Osamaara();
        Nollaus n = new Nollaus();

        perustoimintojenKasittelija.put("summa", s);
        perustoimintojenKasittelija.put("erotus", e);
        perustoimintojenKasittelija.put("tulo", t);
        perustoimintojenKasittelija.put("osamaara", o);
        perustoimintojenKasittelija.put("nollaus", n);
    }

    /**
     * Metodi palauttaa luodun hashMapin.
     *
     * @return luotu hashMap
     */
    public HashMap getHashMap() {
        return perustoimintojenKasittelija;
    }
}
