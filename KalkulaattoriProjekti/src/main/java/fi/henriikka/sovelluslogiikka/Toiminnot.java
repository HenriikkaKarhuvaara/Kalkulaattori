package fi.henriikka.sovelluslogiikka;

public class Toiminnot {

    private double tulos;
    private boolean onnistuikoJako;

    public Toiminnot() {
        this.tulos = 0.0;
        this.onnistuikoJako = true;
    }

    public void summa(double luku) {
        this.tulos += luku;
    }

    public void erotus(double luku) {
        this.tulos -= luku;
    }

    public void osamaara(double luku) {

        if (luku != 0) {
            this.tulos /= luku;
        } else {
            this.onnistuikoJako = false;
        }
    }

    public void tulo(double luku) {
        this.tulos *= luku;
    }

//    public void kumita() {
//    }
    public void nollaa() {
        this.tulos = 0;
    }

    public double getTulos() {
        return this.tulos;
    }

    public void setTulos(double luku) {
        this.tulos = luku;
    }
    
    public boolean onnistuikoJako() {
        return this.onnistuikoJako;
    }

}
