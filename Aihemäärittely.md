**Aihe:** Laskin

Toteutetaan järjestelmä, jolla käyttäjä voi laskea erinnäisiä laskutoimituksia (ja lisäksi piirtää kuvaajia, jos aikaa on tälle toiminnallisuudelle).

Käyttäjä syöttää tekstikenttään luvun (joko näppäimistöllä tai laskimessa valittavissa). Sitten käyttäjä valitsee laskutoimituksen (joka joko näppäimistöstä, tai valittavissa laskimessa), ja sen jälkeen toisen luvun (tai esim. toisen laskutoimituksen sulkeissa). Laskutoimitus suoritetaan näiden lukujen välillä.

Laskimessa on yksi tekstikenttä. Kun lukuja tai laskutoimituksia syötetään tekstikenttään, ne jäävät samaan tekstikenttään näkyviin.

**Esimerkkitapaus:**

* Käyttäjä syöttää tekstikenttään luvun 3
  * Tekstikentässä: 3 
* Käyttäjä painaa +-nappia
  * Tekstikentässä: 3 +
* Käyttäjä syöttää luvun 3
  * Tekstikentässä: 3 + 3
* Käyttäjä painaa =-nappia
  * Tekstikentässä: 3 + 3 = 6
* Käyttäjä painaa +-nappia
  * Tekstikentässä: 6 + 

Siis tässä laskimessa käyttäjä näkee syöttämänsä lausekkeen, eli voi tarkistaa, onko syöttänyt tiedot oikein. Tämä eroaa esim. Macin laskimesta, jossa lukuja on näkyvissä kerrallaan vain yksi, ja aiemmin syötettyjä lukuja ei pääse katsomaan. (Lisäksi lauseketta on mahdollista kumittaa, jos tämän tekeminen onnistuu. Tämäkin eroaa monesta laskimesta, jossa koko lauseke täytyy kirjoittaa uudelleen virheen sattuessa).

En vielä tarkkaan tiedä, kuinka paljon laskutoimituksia laskimella on mahdollista laskea, ja mitä  erikoismerkkejä ( cos, murtoluvut, juuret, potenssit jne ) on valittavissa. Ja miten nämä ovat kirjoitettavissa näppäimistön avulla. (Määritelläänkö omat pikanäppäimet, vai käytetäänkö esim. latexista tuttuja \sqrt jne).


**Käyttäjä:** Laskimen käyttäjä

**Toiminnot:** 

* Avaa laskin
* Syötä luku
* Syötä laskutoimitus
* (Kumita merkkejä) 
* Pyydä vastaus
* Nollaa tekstikenttä
