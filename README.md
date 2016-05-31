# Spaß am Programmieren?

## Hilf uns: Unser Warentransportroboter braucht ein Softwareupdate!

Die Aufgabe des Roboters ist es, Ware durch ein Lager zu transportieren. Das Lager wird mit der Zeit immer voller, und der Roboter muss einen Weg durch dieses Labyrinth aus Kisten finden.

Mit der aktuellen Softwareversion der Cargo Robot Application (CRA) 3.14 verbraucht der Roboter zu viel Energie - er läuft alle Pfade entlang bis er irgendwann den Ausgang findet. Die neue Software bekommt die Karte des Lagers über eine Schnittstelle übergeben und soll daraus den kürzesten Weg durch das Lager im Voraus berechnen.

Hier ein Beispiel:

              Eingabe                Ausgabe
          
          #.#############        #|#############
          #............##        #+-----+.....##
          #######.#######        #######|#######
          #..........####        #......+--+####
          ####.#####..###        ####.#####|.###
          #............##        #.........+-+##
          ############.##        ############|##

Dabei bedeuten:

          # Kiste
          . freie Fläche
          | Roboterweg senkrecht
          - Roboterweg waagerecht
          + Roboterweg Abbiegung

Mehr über unsere Lagerhallen:

- Lagerhallen sind immer Rechteckig, die Kantenlänge ist variabel
- Es gibt genau einen Eingang auf der Oberseite und einen Ausgang auf der Unterseite
- Manche Lagerhallen sind so voll, dass überhaupt kein Durchkommen ist, d.h. keine Lösung existiert. In diesem Fall soll die Software die unveränderte Eingabe zurückliefern.
- Manche Lagerhallen sind so leer, dass es mehrere kürzeste Pfade gibt. Es genügt, wenn Du *eine* dieser Lösungen findest.

Für Java Entwickler:

Dies ist ein Gradle Projekt, das bereits einige Testklassen enthält. Implementiere die Methode `findOptimalPath` in der Klasse `PathFinder`, so dass alle Tests grün sind. Natürlich kannst Du eigene Testfälle hinzufügen, die Du für die Entwicklung benötigst.

Um ein Eclipse Projekt zu erzeugen, gib auf der Kommandozeile ein: `gradlew eclipse`, damit werden die Eclipse spezifischen Projektdateien erzeugt. Um das Projekt zu bauen (und zu testen), verwende `gradlew build`. 

Wir sind gespannt auf Deine Lösung, die vorzugsweise in Java 8 unter Windows laufen sollte. Du kannst auch gerne eine andere Programmiersprache wählen, dann benötigen wir zusätzlich eine kurze Anleitung, wie wir den Code ausführen können. Schicke Deine Lösung bitte zusammen mit Deinen Bewerbungsunterlagen an [HR-tonbeller@fico.com](HR-tonbeller@fico.com), wir freuen uns darauf!

Viel Erfolg!

