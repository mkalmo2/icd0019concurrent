## Mitmelõimelised programmid

Salasõnasi ei hoita andmebaasides tavaliselt avatud teksti kujul. Põhjus on 
selles, et kui keegi peaks seda andmebaasi nägema, siis ei piisa sellest 
veel kasutaja salasõna teada saamiseks.

Seega kui kasutaja esmakordselt omale salasõna valib, siis arvutatakse 
selle põhjal salasõna räsi.

Salasõna räsi näeb tavaliselt välja selline: 8acc8c0c32ada9bb46fe682f50331fe8ba68fbf93d6ae0125ba980abb4df89f1

Sellest räsist aga esialgset salasõna tagasi arvutada ei saa.

Kui kasutaja soovib oma salasõnaga süsteemi sisse logida siis on vaja
kontrollida, kas kasutaja poolt saadetud salasõna on ikka õige.

Salasõna kontrollimiseks arvutatakse kasutaja sisestatud salasõnast räsi 
ja võrreldakse seda räsi varasemalt hoitud räsiga. Kui need langevad kokku, 
siis võib kasutaja süsteemi sisse lubada.

Kui meil on räsi olemas, siis ei ole sellest võimalik küll esialgset 
salasõna arvutada aga me võime proovida paljudest salasõnadest räsi arvutada
kui mõni langeb kokku, siis olemegi esialgse salasõna teada saanud.

Klassis concurrent.HashCracker on toodud kaks salasõna räsi.

Üks salasõna oli 3 ja teine 4 märki pikk. 

Mõlemad sisaldasid numbreid, mõningaid sümboleid ning suuri ja väikeseid tähti.

Võimalikud märgid on loetletud konstandis ALPHABET.

-  Kirjutage ühelõimeline programm, mis proovib läbi kõik kolmekohalised 
   kombinatsioonid, et leida räsile vastav salasõna.
   
   Lihtsaim võimalus kõikide kombinatsioonide läbiproovimiseks on
   tsükkel tsükli sees:   
   ```
   for (char c1 : ALPHABET.toCharArray()) {
     for (char c2 : ALPHABET.toCharArray()) {
       for (char c3 : ALPHABET.toCharArray()) { ...
   ```
   
   Selliselt saab kõik kolmekohalised kombinatsioonid.

-  Kasutage Stream Api võimalusi, et arvutamine tehtaks mitmes lõimes.
   Näite leiate klassist concurrent.examples.Streams.

-  Jagage töö lõimede vahel kasutades lõimede puuli (thread pool).
   Puuli kasutamise näide on klassis concurrent.examples.ParallelWithPool.

