/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriikka.sovelluslogiikka;

public class Osamaara extends Toiminto {

    private boolean onnistuikoJako;

    public Osamaara() {
        onnistuikoJako = true;
    }

    @Override
    public double suoritaToiminto(double x, double y) {

        if (y == 0) {
            onnistuikoJako = false;
        } else {
           super.tulos = x / y;
            return super.tulos;
        }
        return 0;
    }

    public boolean onnistuikoJako() {
        return this.onnistuikoJako;
    }
}