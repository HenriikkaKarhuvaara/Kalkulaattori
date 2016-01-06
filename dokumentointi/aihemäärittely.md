**Aihe:** Laskin

Halutaan järjestelmä, jolla käyttäjä voi laskea peruslaskutoimituksia: summa, erotus,  tulo ja osamäärä. Lisäksi halutaan joitain erikoislaskutoimituksia sekä muunnoksia.

Laskimessa on kolme tekstikenttää. Kahten ensimmäiseen syötetään lukuja, ja kolmanteen tulostuu tulos. Muunnoksissa on käytössä vain ylin syöttökenttä ja tuloskenttä.

Peruslaskutoimituksissa käyttäjä syöttää laskimeen kaksi lukua. Sitten käyttäjä valitsee laskutoimituksen, ja tuloskenttään tulostuu näiden lukujen laskutoimituksen vastaus. Edellisen laskun vastaus tallentuu automaattisesti muistiin. Sen saa siirrettyä napin painalluksella tekstikenttään, jolloin sille voidaan tehdä haluttuja toimintoja. Nollaamalla laskin saadaan tyhjennettyä tekstikentät ja tulokseksi nolla.

Erikoislaskutoimituksessa päivämäärien laskenta käyttäjä syöttää laskimeen kaksi päivämäärää. Oikea toiminto valitsemalla tuloskenttään tulostuu päivämäärien välinen ero päivinä.

Lisäksi halutaan toiminto, joka muuntaa sentit tuumiksi ja tuumat senteiksi. Käyttäjä syöttää tekstikenttään halutun mitan. Sitten käyttäjä valitsee muunnon joko senteiksi tai tuumiksi. Tällöin haluttu tulos tulostuu tuloskenttään.

Lisäksi halutaan toiminto, joka muuntaa kilot paunoiksi ja paunat kiloiksi. Käyttäjä syöttää tekstikenttään halutun painon. Sitten käyttäjä valitsee muunnon joko paunoiksi tai kiloiksi. Tällöin haluttu tulos tulostuu tuloskenttään.

**Esimerkkitapauksia**

**Esimerkkitapaus / Peruslaskutoimitus ja tallennetun vastauksen käyttö:**

* Käyttäjä syöttää 1. tekstikenttään luvun 3
* Käyttäjä syöttää 2. tekstikenttään luvun 2
* Käyttäjä painaa +-nappia
  * Tuloskentässä: 5
* Käyttäjä painaa A-nappia
  * 1. tekstikentässä: 5
  * 2. tekstikenttä tyhjä
  * tuloskenttä tyhjä

**Esimerkkitapaus / Peruslaskutoimitus ja tallennetun vastauksen käyttö:**

* Käyttäjä syöttää 1. tekstikenttään luvun 3
* Käyttäjä syöttää 2. tekstikenttään luvun 2
* Käyttäjä painaa +-nappia
  * Tuloskentässä: 5
* Käyttäjä painaa C-nappia
  * 1. tekstikenttä tyhjä
  * 2. tekstikenttä tyhjä
  * tuloskentässä 0
  
  

**Esimerkkitapaus / Erikoislaskutoimitus päivämäärät:**

* Käyttäjä syöttää 1. tekstikenttään 26 08 1995
* Käyttäjä syöttää 2. tekstikenttään 27 08 1995
* Käyttäjä painaa D-nappia
  * Tuloskentässä päivämäärien ero, eli yksi päivä
 
 **Esimerkkitapaus / Muunnos sentit tuumiksi:**

* Käyttäjä syöttää 1. tekstikenttään 2.54
* Käyttäjä painaa CI (cm to inches) -nappia
  * Tuloskentässä tuumat eli yksi
  * 
  

 **Esimerkkitapaus / Käyttäjä syöttää muun kuin numeron:**

* Käyttäjä syöttää 1. tekstikenttään moi
* Käyttäjä syöttää 2. tekstikenttään moimoi
* Käyttäjä painaa +-nappia
  * Laskin tulostaa virheilmoituksen 


**Käyttäjä:** 

Laskimen käyttäjä

**Toiminnot:** 

* Avaa laskin
* Syötä luku
* Valitse laskutoimitus
* Nollaa tekstikenttä
