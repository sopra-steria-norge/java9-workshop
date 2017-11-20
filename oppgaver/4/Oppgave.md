# JShell, Collections og Stream


## Oppgave 4
### a)

 * Start opp jshell
 * Skriv inn "Hello, World!" og trykk enter.
 * Print "Hello, World!" ved å bruke $1. 
 * Modifiser variablen til "JShell - Hello, World!". 
 * Definer til en navngitt streng som innehar samme tekst (ved å assigne verdi fra variablen).  
 
 Observer at semikolon ikke er nødvendig i JShell (når man er i ren jshell-context).  

### b)

* Skriv /help for å se en oversikt over kommandoer
* Finn ut hvilke pakker som er importert
* Finn verdien av 151230951 + 502801459 i jshell
* Finn kvadratroten til 2053449225 i jshell (tips -> benytt tab for å få frem dokumentasjon)

### c)

* Lag en metode som returner doblet inputverdi, og bruk den for å doble en vilkårlig verdi
* Lagre sesjonen til en fil og lukk jshell
* Åpne jshell igjen, og hent inn lagret sesjon. Verifiser at metoder som ble opprettet i forrige sesjon er tilgjengelige


### d)

* Legg til commons-lang3 på classpath
    Last den ned, eller bygg prosjektet- Havner isåfall her: ~/.m2/repository/org/apache/commons/commons-lang3/3.6/commons-lang3-3.6.jar
    importer org.apache.commons.lang3.*
* Ta en kikk på metodene som StringUtils tilbyr
* Gjør en sjekk i jShell vha StringUtils for å finne ut av om en streng inneholder kun bokstaver. Gjør tilsvarende for "kun tall"
    "Abcde1"
    "Abcde"
    "92465945"
    "a92465945"

### f)

* Lag en liste med navn i jShell vha Collection Factory-metoder (Se f.eks List. <tab>, eller finn frem i javadoc)
* Skriv listen til en fil: navn.txt
    Observer at man ikke trenger å forholde seg til checked exceptions når man opererer i jshell (utenfor metoder etc)
* Lag et Set og et Map
* Forsøk å legg til et nytt element i listen
    Observer at collections opprettet via Collection Factory-metoder er immutable. 


### g)

* Gitt en strøm av tall fra 1-100, print alle tall > 50
* Gitt en strøm av tall fra 1-100, print alle tall < 50
* Gitt en strøm av tall fra 1-100, print alle tall


