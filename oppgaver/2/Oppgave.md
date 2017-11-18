# Http2 client

## Oppgave 2
### a)
Benytt javadocen for å sette opp en HTTP2-client og gjør synkrone kall mot http://www.vondess.com/dovre/api. 
Link til [Javadoc](https://docs.oracle.com/javase/9/docs/api/overview-summary.html)

Vurder følgende:
* Hva er spesielt med modulen klienten ligger i?
* Bør den benyttes i produksjonskode?

### b)
Endre klienten fra oppgave _a)_ til å være asynkron.
Legg inn _Thread.sleep(5000)_ før du sjekker om det har kommet respons.

NB! Husk å kanseler requestet hvis det ikke har kommet respons. 