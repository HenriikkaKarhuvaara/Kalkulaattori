
package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa mahdollisuuden muuttaa kilot paunoiksi ja paunat kiloiksi.
 * 
 */
public class PaunatJaKilot {
    private double kilot;
    private double paunat;
    
    
    /**
     * Metodi tulkitsee käyttäjän syötteen paunoina, muuntaa sen kiloiksi ja 
     * palauttaa arvon.
     * 
     * @param paunat käyttäjän syöttämä paino
     * 
     * @return Käyttäjän syöte muunnettuna kiloiksi
     */
    public double paunatKiloiksi(double paunat) {
        
        this.kilot = paunat / 2.2046;
        return this.kilot;
        
    }
    
     /**
     * Metodi tulkitsee käyttäjän syötteen kiloina, muuntaa sen paunoiksi
     * ja palauttaa sen.
     * 
     * @param kilot käyttäjän söyttämä paino
     * 
     * @return Käyttäjän syöte muunnettuna paunoiksi
     */
    public double kilotPaunoiksi(double kilot) {
        
        this.paunat = kilot * 2.2046;
        return this.paunat;
    }
}
