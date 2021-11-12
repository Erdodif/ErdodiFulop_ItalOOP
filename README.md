# ErdodiFulop_ItalOOP
Messze eddig a legjobb optimalizálás és gondolat-olvasás feladatom, egyúttal a legrosszabb OOP feladat, amit megnéztem.
Az UML diagram végzetes szemantikai hibákat tartalmaz, amik miatt a futtatható osztályok és azok tesztelése lehetetlen.

Osztályok, amik megfeleltek:
    Gyumolcs
    AlkoholosItal?
Interfész, ami megfelelt:
    Alkoholos

Hibák:
    Gyumolcs:
        Osztálynak nem lehet 1-nél több ősosztálya, ez kritikus hiba
        A mibolKeszult() metódus, tekintve, hogy csak íz és fajta van, a fajtát hivatott visszaadni, amit a mibolFacsartak() metódus már implementált
    Ital:
        Az öröklődés miatt intenfésszé téve megfelelően működik
    AlkoholosItal:
        Ahhoz, hogy további öröklődési hiba ne legyen és több metódus ne kerüljön implementálásra, az osztályt absztrakttá kellett tenni, amiből így példány semmiképp nem jöhet létre.
            Abban az esetben hiba, ha közvetlenül szeretnénk példányosítani
    Bor:
        Az eredeti feladat 'lejarat' paramétere nincs feltüntetvem így implementálva sem
        A milyenSzollobolKeszult() metódus a fajtát hivatott visszaadni, amit a mibolKeszult() metódus már implementált
        A bor szőllőből készül, ha nem tévedek. Az nem gyümölcs? 🤷‍♂️ (Ajánlott a konstruktor túlterhelése)
        Az alkohol kizárólagos ízforrás a bornál, így ezen attribútum visszaadása nem kéne hogy az ősosztályából hívódjon meg közvetlen
    Aszu:
        Újjfent felmerül a kérdés, nincs íze?
        A konstruktor kritikus hibája, hogy íz, mint bemenő paramér nincs, és nincs alapértelmezett értéke sem
    ErjedtGyumolcs:
        A borhoz hasonlóan, tekintve, hogy szerves (he-he) köze van a a gyümölcshöz, ajánlott lenne a konstruktor túrterhelése
 
 Problémák a konstruktorokkal:
     Hasonló működésű, közös adattaggal rendelkező osztályoknál hogy különféle módon lehet kizárólag megadni az adatot, nagyban nehezíti a fejlesztést, mert a tiszta kódú metódus meghívásához nem kell dokumentáció, csak a működési elvéről és visszatéréséről. Legalább a közös adattagokhoz, amik egyébként osztály paraméterei is, kegyenek egybe fogva, és annak megfelelően meghívva.
     
Tekintve, hogy a feladat teljességében nem elvégezhető, így e munkám félkészen kényszerültem beküldeni.
Az adattagok átstrukturálása erősen ajánlott, amennyiben szándékukban áll a programkönyvárat használni.
Olvasóm elfecsérelt perceire nincsen magyarázatom, abban reménykedek, hogy ezen apró kitérő tanulságos.
