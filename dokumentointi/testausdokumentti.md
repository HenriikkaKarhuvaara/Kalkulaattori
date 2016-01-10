**Testausdokumentti**

Pit-raportin mukaan olen testannut ohjelman toimintaa melko kattavasti. Koko projektin testauksen rivikattavuus on 99% ja 
mutaatiot 98%.

- Sovelluslogiikan testausprosentti on täydet 100%.
- Nyt laskin ei valita, jos esimerkiksi pituudeksi asetetaan negatiivinen luku. Laskin ei kuitenkaan myöskään kaadu, vaan      laskee tämän normaalisti. Tämän tyyppiset tilanteet olisi voinut vielä    
  käsitellä, jolloin ne olisivat olleet osana myös sovelluslogiikan testausta.


Käyttöliittymää ei ilmeisesti olisi tarvinnut testata, mutta OTM-kurssilta jäi mieleen miten se tehdään. 

- Main-luokassa testauksen rivikattavuus on vain 67%. En perehtynyt tähän sen tarkemmin, sillä se ei ilmeisesti ollut   
  tarpeen. Mutaatioista on tutkittu kuitenkin täydet 100%.
- Tapahtumankuuntelijan testaus on myös täydet 100% sekä rivikattavuudelta että mutaatiotestaukselta.
- Kayttoliittymassa tutkimatta jää ikkunan sulkumekanismi ja metodi getFrame(). Rivikattavuus on 99%, mutta mutaatiotestaus    jää 94%.

Laskinta käyttäessä kuitenkin näyttäisi siltä, että testaamattakin jääneet osiot toimisivat halutusti.

- Jar-tiedostoa en saanut millään toimimaan, vaikka yritin mielestäni vaikka mitä versioita luokan nimestä: kalkulaattori.main, fi.henriikka.kalkulaattori.main, main.java jne.
