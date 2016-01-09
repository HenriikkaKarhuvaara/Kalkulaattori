** Rakennekuvaus **


Luokka Kayttoliittyma vastaa siitä, että laskimen graafinen käyttöliittymä luodaan, ja se näkyy käyttäjälle. 
Siellä luodaan laskimen tekstikentät ja nappulat. Luokka Tapahtumankuuntelija vastaa siitä, että laskin reagoi
käyttäjän toimiin. Tapahtumankuuntelijassa määritetään, mitä tapahtuu, kun käyttäjä painaa tiettyä nappulaa. Luokassa 
Kayttoliittyma luodaan oma Tapahtumankuuntelija, ja se lisätään jokaiselle laskimen nappulalle.

Ns. välikätenä sovelluslogiikkaan toimii luokka Toimintojenkasittelija. Tapahtumankuuntelijalla on oma toimintojen-
käsittelijänsä, joka vastaa siitä, että nappulaa painettaessa suoritetaan oikea toiminto. Tapahtumankuuntelija ei siis 
tunne varsinaisia toimintoja, vaan se on antanut tämän tehtävän omalle toimintojenkäsittelijälleen.

Toimintojenkäsittelillä on parametrina hashMap. Tarkoitus oli, että jokainen laskimen
toiminto käsiteltäisiin tämän kautta. Nyt hashMapissa on kuitenkin vain laskimen perustoiminnot, ja luokalla on 
erikseen parametrit muisti, päivämäärälaskuri, sentit ja tuumat sekä paunat ja kilot.

Kun toimintojenkäsittelijä saa tapahtumankuuntelijalta käskyn suorittaa perustoiminto, se etsii hashMapista oikean 
toiminnon ja kutsuu se suoritusmetodia. Neljälle erillelle toiminnolle toimintojenkäsittelijällä on omat metodinsa.
Kun toimintojenkäsittelijä saa käskyn suorittaa jonkun näistä neljästä erillisestä 
toiminnosta, se osaa kutsua näiden suoritusmetodeja.
