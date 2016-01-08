
package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa mahdollisuuden muuttaa kilot paunoiksi ja paunat kiloiksi.
 * 
 */
public class PaunatJaKilot {
    private double kilot;
    private double paunat;
    
    
    /**
     * Metodi tulkitsee käyttäjän syötteen paunoina, ja muuntaa sen kiloiksi.
     * 
     * @param pounds
     * 
     * @return Käyttäjän syöte muunnettuna kiloiksi
     */
    public double paunatKiloiksi(double paunat){
        
        this.kilot = paunat / 2.2046;
        return this.kilot;
        
    }
    
     /**
     * Metodi tulkitsee käyttäjän syötteen kiloina, ja muuntaa sen paunoiksi.
     * 
     * @param kilot
     * 
     * @return Käyttäjän syöte muunnettuna paunoiksi
     */
    public double kilotPaunoiksi(double kilot) {
        
        this.paunat = kilot * 2.2046;
        return this.paunat;
    }
}
