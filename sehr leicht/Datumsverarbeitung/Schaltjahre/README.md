# Aufgabe: Schaltjahre
> **Themengebiet:** Datumsverarbeitung  
> **Schwierigkeitsgrad:** Sehr leicht $\small\color{orange}{\left(\blacksquare\Box\Box\Box\Box\right)}$  

Während in unserem Kalender das Jahr gewöhnlich in 365 Tage unterteilt wird, ist dies doch astronomisch nicht ganz korrekt. Das Jahr hat eine Länge von etwa 365,25 Tagen. Aufgrund dessen muss nahezu alle 4 Jahre eine Korrektur in Form eines Schaltjahres mit 366 Tagen eingefügt werden. Dabei gibt es zwei Besonderheiten zu beachten:

- Jahre, die durch 100 teilbar sind, werden Säkularjahre genannt und sind keine Schaltjahre.
- Allerdings sind Säkularjahre, die auch durch 400 teilbar sind, doch wieder Schaltjahre.

Details finden Sie unter https://de.wikipedia.org/wiki/Schaltjahr.

Schreiben Sie eine Methode ```boolean isLeap(int)``` – natürlich ohne Verwendung von ```java.time.Year.isLeap()```.

**Beispiele**
Eingabe |	Regel	| Resultat
:---:|:---:|:---:|
1900	|Säkularjahr|	kein Schaltjahr
2000	|Säkularjahr, aber durch 400 teilbar|	Schaltjahr
2020|	durch 4 teilbar|	Schaltjahr


> [Mögliche Lösung](https://github.com/ShantGananian/JavaProgrammierung/blob/master/sehr%20leicht/Datumsverarbeitung/Schaltjahre/src/main/java/Schaltjahre.java)
