**Rakennekuvaus**


Luokka Kayttoliittyma vastaa siitä, että laskimen graafinen käyttöliittymä luodaan, ja se näkyy käyttäjälle. 
Siellä luodaan laskimen tekstikentät ja nappulat. Luokka Tapahtumankuuntelija vastaa siitä, että laskin reagoi
käyttäjän toimiin. Tapahtumankuuntelijassa määritetään, mitä tapahtuu, kun käyttäjä painaa tiettyä nappulaa. Luokassa 
Kayttoliittyma luodaan oma Tapahtumankuuntelija, ja se lisätään jokaiselle laskimen nappulalle.

Ns. välikätenä sovelluslogiikkaan toimii luokka Toimintojenkasittelija. Tapahtumankuuntelijalla on oma toimintojen-
käsittelijänsä, joka vastaa siitä, että nappulaa painettaessa suoritetaan oikea toiminto. Tapahtumankuuntelija ei siis 
tunne varsinaisia toimintoja, vaan se on antanut tämän tehtävän omalle toimintojenkäsittelijälleen.

Toimintojenkäsittelillä on parametrina hashMap. Tarkoitus oli, että jokainen laskimen
toiminto käsiteltäisiin tämän kautta, jolloin ohjelman rakenne olisi järkevämpi ja laajennettavampi. Nyt hashMapissa on kuitenkin vain laskimen perustoiminnot, ja luokalla on 
erikseen parametrit muisti, päivämäärälaskuri, sentit ja tuumat sekä paunat ja kilot.

Kun toimintojenkäsittelijä saa tapahtumankuuntelijalta käskyn suorittaa perustoiminto, se etsii hashMapista oikean 
toiminnon ja kutsuu sen suoritusmetodia. Neljälle erillelle toiminnolle toimintojenkäsittelijällä on omat metodinsa.
Kun toimintojenkäsittelijä saa käskyn suorittaa jonkun näistä neljästä erillisestä 
toiminnosta, se osaa kutsua näiden suoritusmetodeja.

Jokainen toiminto on oma luokkansa, ja niissä on määritelty toiminnon suoritus. Perustoiminnot perivät
abstraktin luokan Perustoiminto, ja vastauksen käsittely toimii tämän kautta. Yläluokalla Perustoiminto on parametri tulos, ja alaluokat päivittävät tätä omien laskutoimitustensa tuloksilla. Abstrakti luokka toimii myös arvona hashMapissa.  
Muisti, PaivamaaraLaskuri, SentitJaTuumat sekä PaunatJaKilot
ovat itsenäisiä luokkia, joissa on määritelty toiminnon suoritus.

Jos aikaa olisi ollut enemmän, olisin muuttanut ohjelman rakennetta vielä siten, että toimintojenkäsittelijä ei tuntisi 
luokkia Muisti, Paivamaaralaskuri, SentitJaTuumat ja PaunatJaKilot suoraan vaan abstraktin luokan tai rajapinnan kautta.
Lisäksi olisi järkevää, jos kaikki toiminnot toteuttaisivat saman rajapinnan tai perisivät saman abstraktin luokan, 
jolloin toimintojenkäsittelijä voisi käsitellä niitä yhdessä hashMapissa.

