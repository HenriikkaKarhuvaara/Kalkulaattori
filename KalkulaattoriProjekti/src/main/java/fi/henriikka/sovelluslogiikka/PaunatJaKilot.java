
package fi.henriikka.sovelluslogiikka;

/**
 * Luokka tarjoaa mahdollisuuden muuttaa kilot paunoiksi ja paunat kiloiksi.
 * 
 */
public class PaunatJaKilot {
    
    /**
     * Metodi tulkitsee käyttäjän syötteen paunoina, ja muuntaa sen kiloiksi.
     * 
     * @param pounds
     * 
     * @return Käyttäjän syöte muunnettuna kiloiksi
     */
    public double paunatKiloiksi(double pounds){
        
        double kilot = pounds / 2.2046;
        return kilot;
        
    }
    
     /**
     * Metodi tulkitsee käyttäjän syötteen kiloina, ja muuntaa sen paunoiksi.
     * 
     * @param kilot
     * 
     * @return Käyttäjän syöte muunnettuna paunoiksi
     */
    public double kilotPaunoiksi(double kilot) {
        
        double paunat = kilot * 2.2046;
        return paunat;
    }
}
