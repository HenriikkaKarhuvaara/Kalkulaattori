package fi.henriikka.sovelluslogiikka;

import java.util.Date;
import java.util.HashMap;

/**
 * Luokka toimii välikätenä tapahtumankuuntelijalle, etsii oikean laskimen
 * perustoiminnon sen nimen avulla, suorittaa oikean laskutoimituksen tai nollaa
 * laskimen, lisäksi käsittelee lisätoimintoja: Muisti, päivämäärä, pituusmuunnin ja
 * painomuunnin ja suorittaa niille oikean toiminnon.
 */
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
     * Metodi etsii oikean perustoiminnon hashMapista, ja toteuttaa kyseisen
     * toiminnon suorituksen käyttäjän antamilla arvoilla.
     *
     * @param toiminnonNimi käyttäjän antama syöte
     * @param x Käyttäjän antama syöte
     * @param y Käyttäjän antama syöte
     *
     * @return Oikean toiminnon laskutoimituksen tulos
     */
    public double suoritaPerustoiminto(String toiminnonNimi, double x, double y) {
        return perustoimintojenKasittelija.get(toiminnonNimi).suoritaToiminto(x, y);
    }

    /**
     * Kutsuu luokan PaivamaaraLaskuri metodia laskePaivamaarien ero, siis 
     * palauttaa
     * parametrina annettujen päivämäärien eron.
     *
     * @param x ensimmäinen päivämäärä
     * @param y toinen päivämäärä
     *
     * @return päivämäärien ero päivinä
     */
    public double suoritaPaivamaaralaskenta(Date x, Date y) {
        return pvm.laskePaivamaarienEro(x, y);
    }

    /**
     * Tallentaa annetun arvon muistiin, eli asettaa luokan Muisti vastauksen
     * arvoksi annetun arvon.
     *
     * @param x tallennettava arvo
     */
    public void lisaaMuistiin(double x) {
        muisti.setVastaus(x);
    }

    /**
     * Hakee tallennetun vastauksen, eli palauttaa luokan Muisti vastauksen
     * arvon.
     *
     * @return Luokan Muisti parametrin vastaus arvo
     */
    public double annaViimeisinVastaus() {
        return muisti.getVastaus();
    }
    
    
    

    /**
     * Muuttaa annetun arvon tuumiksi kutsumalla luokan SentitJaTuumat oikeaa
     * metodia.
     *
     * @param cm muunnettava pituus sentteinä
     *
     * @return annettu arvo tuumina
     */
    public double sentitTuumiksi(double cm) {
        return sjt.sentitTuumiksi(cm);
    }

    /**
     * Muuttaa annetun arvon senteiksi kutsumalla luokan SentitJaTuumat oikeaa
     * metodia.
     *
     * @param inch muunnettava pituus tuumina
     *
     * @return annettu arvo sentteinä
     */
    public double tuumatSenteiksi(double inch) {
        return sjt.tuumatSenteiksi(inch);
    }

    /**
     * Muuttaa annetun arvon kiloiksi kutsumalla luokan PaunatJaKilot oikeaa
     * metodia.
     *
     * @param pounds muuttettava paino paunoina
     *
     * @return annettu arvo kiloina
     */
    public double paunatKiloiksi(double pounds) {
        return pjk.paunatKiloiksi(pounds);
    }

    /**
     * Muuttaa annetun arvon paunoiksi kutsumalla luokan PaunatJaKilot oikeaa
     * metodia.
     *
     * @param kilot muunnettava paino kiloina
     *
     * @return annettu arvo paunoina
     */
    public double kilotPaunoiksi(double kilot) {
        return pjk.kilotPaunoiksi(kilot);
    }

    /**
     * Metodi luo hashMapin, johon lisätään laskimen perustoiminnot.
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
