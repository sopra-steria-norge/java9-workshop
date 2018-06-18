# Workshop i Java 9 og 10

Oppgavene tar for seg litt av det som er nytt i java9 og java 10. 

Merk at Git bash ikke anbefales for jshell-oppgaver

Javadoc: 
* https://docs.oracle.com/javase/9/ 
* https://docs.oracle.com/javase/10/ 


# Oppgave 1 - JShell
## a)

 * Start opp jshell
 * Skriv inn "Hello, World!" og trykk enter.
 * Print "Hello, World!" ved å bruke $1. 
 * Modifiser variablen til "JShell - Hello, World!". 
 * Definer til en navngitt streng som innehar samme tekst (ved å assigne verdi fra variablen).  
 
 Observer at semikolon ikke er nødvendig i JShell (når man er i ren jshell-context).  

## b)

* Skriv /help for å se en oversikt over kommandoer
* Finn ut hvilke pakker som er importert
* Finn verdien av 151230951 + 502801459 i jshell
* Finn kvadratroten til 2053449225 i jshell (tips -> benytt tab for å få frem dokumentasjon)

## c)

* Lag en metode som returner doblet inputverdi, og bruk den for å doble en vilkårlig verdi
* Lagre sesjonen til en fil og lukk jshell
* Åpne jshell igjen, og hent inn lagret sesjon. Verifiser at metoden som ble opprettet i forrige sesjon er tilgjengelige


# Oppgave 2 - Java9 Modules 

## a)
Forhold deg til følgende 2 moduler:
* calculator
* utils

Sett opp korrekte _exports_ og _requires_, og få koden til å kompillere. Verifiser med å kjøre _RunMe.java_ i 
calculator-modulen. 

### b)
Oppgaven består av 3 moduler
* calculator
* utils
* printer

Bytt ut _System.out.println_ i klassen _Calculator_ i _calculator-modulen_ med _Printer.println_ fra _printer-modulen_, og få koden 
til å kompilere

### c)
Oppgaven består av 1 modul
* gui

Verifisers ved å kjøre  _RunMeApplication.java_.

NB! Det er to mulige løsninger på utfordringen. Prøv begge :) 

# Oppgave 3 - Http2 client 
## a)
Benytt javadocen for å sette opp en HTTP2-client og gjør synkrone kall mot http://www.vondess.com/dovre/api. 
Link til [Javadoc](https://docs.oracle.com/javase/9/docs/api/overview-summary.html)

Vurder følgende:
* Hva er spesielt med modulen klienten ligger i?
* Bør den benyttes i produksjonskode?

## b)
Endre klienten fra oppgave _a)_ til å være asynkron.
Legg inn _Thread.sleep(5000)_ før du sjekker om det har kommet respons.

NB! Husk å kanseler requestet hvis det ikke har kommet respons. 


# Oppgave 4 - Endringer i Collections- og Stream-API (og litt mer jshell) (Java9)


## a)

* Lag en liste med navn i jShell vha Collection Factory-metoder (Se f.eks List. <tab>, eller finn frem i javadoc) 
* Skriv listen til en fil: navn.txt
    Observer at man ikke trenger å forholde seg til checked exceptions når man opererer i jshell (utenfor metoder etc)
* Lag et Set og et Map
* Forsøk å legg til et nytt element i listen
    Observer at collections opprettet via Collection Factory-metoder er immutable. 


## b)

Bruk dropwhile, takewhile og utfør følgende:

* Gitt en strøm av tall fra 1-100, print alle tall > 50
* Gitt en strøm av tall fra 1-100, print alle tall < 50
* Gitt en strøm av tall fra 1-100, print alle tall

# Oppgave 5 - Java 10 - Local variable type inference 

* Lek litt med var - deklarer noen objekter - hvorav noen er generics
* Lag en for løkke med var
* Lag en metode som returnerer var og se hva som skjer
* Lag en klasse med member deklarert som var og se hva som skjer
* Lag en metode som returnerer en Map<String, String> og deklarer returverdien som en lokal variabel med var
* Gitt overstående - gjør deg selv noen tanker om den nye variablen 
    ** Hvordan kan dette påvirke lesbarhet
    ** Er dette en positiv eller negativ endring av språket 

# Oppgave 6 - Java 10 - Endringer i Collections og Optional

## a) 

* Lag en liste som inneholder duplikater på 'tradisjonell måte'
* Konverter denne til et set
* Print ut settet, og forsøk å legge til et nytt element. 

## b) 

* Gitt en strøm av tall, opprett en immutable liste av tallene

## c)

* Lag en Optional som inneholder null
* Ta i bruk ny metode som kom med java 10
* Sammenlikn med Optional.get og Optional.orElseThrow((Supplier<? extends X> exceptionSupplier) 
og gjør deg noen tanker om lesbarhet


# Oppgave 7 - Private methods i interfacer

## a)
Få testene i _DemoInterfaceTest.java_ til å gå grønt uten å utvide interface med nye metoder.


# Oppgave 8 - Jshell - utforsking av API 
* Legg til commons-lang3 på classpath
    Last den ned, eller bygg prosjektet- Havner isåfall her: ~/.m2/repository/org/apache/commons/commons-lang3/3.6/commons-lang3-3.6.jar
    importer org.apache.commons.lang3.*
* Ta en kikk på metodene som StringUtils tilbyr
* Gjør en sjekk i jShell vha StringUtils for å finne ut av om en streng inneholder kun bokstaver. Gjør tilsvarende for "kun tall"
    "Abcde1"
    "Abcde"
    "92465945"
    "a92465945"
* Hvis du har nyeste versjon av Intellij - alst konsollet    

# JLink

## Oppgave 9

* Opprett et image vha Jlink
    Se her for hjelp: http://openjdk.java.net/projects/jigsaw/quick-start
    Blir litt lav-nivå pga foreløpig manglende verktøystøtte. Jlink-plugin fra maven finnes i alpha-1, men 
    fremstår som buggy. 
    
* Hvor ofte trenger du Corba i jdken din?
* Sammenlikn størrelsen på imaget og jdken
* Tenk gjennom hva bruk av Jlink kan bety for størrelsen på f.eks docker-containere

## Oppgave 10

* Finn på noen morsomt å gjøre selv, relatert til java 9 og 10
