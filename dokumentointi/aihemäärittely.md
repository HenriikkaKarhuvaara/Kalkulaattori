**Aihe:** Laskin

Halutaan järjestelmä, jolla käyttäjä voi laskea erinnäisiä laskutoimituksia.

Käyttäjä syöttää tekstikenttään luvun näppäimistöllä (tai laskimessa valittavissa?). Sitten käyttäjä valitsee laskutoimituksen, joka valittavissa laskimessa (tai näppäimistöllä?), ja sen jälkeen toisen luvun (tai esim. toisen laskutoimituksen sulkeissa?). Laskutoimitus suoritetaan näiden lukujen välillä.

Laskimessa on kaksi tekstikenttää. Toiseen käyttäjä syöttää lukuja, ja toiseen tulee tulos. Tavoitteena olisi, että lauseke olisi käytäjälle näkyvissä.

**Esimerkkitapaus:**

* Käyttäjä syöttää syötekenttään luvun 3
  * Tuloskentässä: 3 
* Käyttäjä painaa +-nappia
  * Syotekentässä: 3 +
* Käyttäjä syöttää luvun 3
  * Tuloskentässä: 3 + 3
* Käyttäjä painaa =-nappia
  * Syotekentässä: 3 + 3 = 6
* Käyttäjä painaa +-nappia
  * Syotekentässä: 6 + 

Siis tavoitteena on, että tässä laskimessa käyttäjä näkee syöttämänsä lausekkeen, eli voi tarkistaa, onko syöttänyt tiedot oikein. Tämä eroaa esim. Macin laskimesta, jossa lukuja on näkyvissä kerrallaan vain yksi, ja aiemmin syötettyjä lukuja ei pääse katsomaan. (Lisäksi lauseketta on mahdollista kumittaa, jos tämän tekeminen onnistuu. Tämäkin eroaa monesta laskimesta, jossa koko lauseke täytyy kirjoittaa uudelleen virheen sattuessa).

En vielä tarkkaan tiedä, kuinka paljon laskutoimituksia laskimella on mahdollista laskea, ja mitä  erikoismerkkejä ( cos, murtoluvut, juuret, potenssit jne ) on valittavissa. Ja miten nämä ovat kirjoitettavissa näppäimistön avulla. (Määritelläänkö omat pikanäppäimet, vai käytetäänkö esim. latexista tuttuja \sqrt jne).


**Käyttäjä:** Laskimen käyttäjä

**Toiminnot:** 

* Avaa laskin
* Syötä luku
* Valitse laskutoimitus
* (Kumita merkkejä) 
* Pyydä vastaus
* Nollaa tekstikenttä
