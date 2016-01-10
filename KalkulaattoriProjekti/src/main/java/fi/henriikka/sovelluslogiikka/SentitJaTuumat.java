
package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa mahdollisuuden muuntaa sentit tuumiksi.
 * 
 */
public class SentitJaTuumat {
    private double sentit;
    private double tuumat;
    
    /**
     * Metodi tulkitsee käyttäjän syötteen sentteinä, ja muuntaa sen tuumiksi.
     * 
     * @param cm käyttäjän syöttämä pituus
     * 
     * @return Käyttäjän antama syöte tuumina
     */
    public double sentitTuumiksi(double cm) {
        
        this.tuumat = cm / 2.54;
        return this.tuumat;
        
    }
    
    
    /** 
     * Metodi tulkitsee käyttäjän syötteen tuumina, ja muuntaa sen senteiksi.
     * 
     * @param inch käyttäjän syöttämä pituus
     * 
     * @return Käyttäjän antama syöte sentteinä
     */
    public double tuumatSenteiksi(double inch) {
        
        this.sentit = inch * 2.54;
        return this.sentit;
    }
}
