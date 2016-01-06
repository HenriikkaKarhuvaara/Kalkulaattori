
package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa mahdollisuuden muuntaa sentit tuumiksi.
 * 
 */
public class SentitJaTuumat {
    
    /**
     * Metodi tulkitsee käyttäjän syötteen sentteinä, ja muuntaa sen tuumiksi.
     * 
     * @param cm
     * 
     * @return Käyttäjän antama syöte tuumina
     */
    public double sentitTuumiksi(double cm) {
        
        double tuumat = cm / 2.54;
        return tuumat;
        
    }
    
    
    /** 
     * Metodi tulkitsee käyttäjän syötteen tuumina, ja muuntaa sen senteiksi.
     * 
     * @param inch
     * 
     * @return Käyttäjän antama syöte sentteinä
     */
    public double tuumatSenteiksi(double inch) {
        
        double sentit = inch * 2.54;
        return sentit;
    }
}
