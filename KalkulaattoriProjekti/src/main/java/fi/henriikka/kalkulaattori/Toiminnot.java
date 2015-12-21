package fi.henriikka.kalkulaattori;

public class Toiminnot {

    private int tulos;
    private boolean onnistuikoJako;

    public Toiminnot() {
        this.tulos = 0;
        this.onnistuikoJako = true;
    }

    public void summa(int luku) {
        this.tulos += luku;
    }

    public void erotus(int luku) {
        this.tulos -= luku;
    }

    public void osamaara(int luku) {

        if (luku != 0) {
            this.tulos /= luku;
        } else {
            this.onnistuikoJako = false;
        }
    }

    public void tulo(int luku) {
        this.tulos *= luku;
    }

//    public void kumita() {
//    }
    public void nollaa() {
        this.tulos = 0;
    }

    public int getTulos() {
        return this.tulos;
    }

    public void setTulos(int luku) {
        this.tulos = luku;
    }
    
    public boolean onnistuikoJako() {
        return this.onnistuikoJako;
    }

}
