## Aenderungsverlauf

[logback 3638394] "Einfugen von Dependencies fuer Logback Core und API"
 1 file changed, 11 insertions(+)

[logback 45e066e] "Einfugen von Dependencies fuer Logback "logback-classic""
 1 file changed, 6 insertions(+), 1 deletion(-)

[logback e0dd31c] "Entfernen scope-tag von org.slf4j - dependency"
 1 file changed, 1 insertion(+), 2 deletions(-)

[logback 8f21800] "Erstellen von logback.xml mit logger fuer "App" und "Rational""
 1 file changed, 21 insertions(+)
 create mode 100644 SMG_ZahlenAufgabe/src/main/resources/logback.xml

[logback 6b6131c] "Einfuegen von logger zu main in App.java"
 1 file changed, 14 insertions(+), 2 deletions(-)
 
[logback 98ec7c9] Aendern Level von "warn" auf "debug" fuer "numbers.Rational"
 1 file changed, 1 insertion(+), 1 deletion(-)

[logback c66e530] "Aendern loglevel fuer Rational - logger"
 1 file changed, 3 insertions(+), 3 deletions(-)

[logback a8a22e0] "Einfuegen von Logger zu eingabe - Methode"
 1 file changed, 141 insertions(+), 99 deletions(-)
 
[logback 39ec5ac] Einfuegen von logger zu ggt(), kuerzen(), eingabe()
 1 file changed, 34 insertions(+), 16 deletions(-)

[logback 8266b80] "Anpassen von logbag.xml fuer die ausgabe in Datei"
 1 file changed, 12 insertions(+), 4 deletions(-)

## Zusammenfassung: Aufgabe fue Hinzufuegen von Logger(LOGBack)
Diese Aufgabe wurde nachder folgenden Aufgabe: "Umwandlung nach Maven - Projekt" erledigt, da das Einfuegen von notwendigen
Bibliotheken via Mvn - Dependencies bequeme ist.
Als erstes wurden die Abhaengigkeiten fuer LOGBack und slf4j in pom.xml integriert und logback.xml in Verzeichnis resources eingerichtet. Dabei wurden drei Logger mit Namen: App (Level: INFO), numbers.Rational (Level: ERROR), RationalInfo 
(Level: INFO) erstellt. Das Root - Level ist auf debug gestellt. Logger wurden in Methoden ggt(), kuerzen() und eingabe() in
Klasse Rational und einschliesslich in main eingefuegt (Da diese Methoden fuer die Anwendung relevant sind). Logger wurde erstmal auf Konsole getestet und dannach wurde die logback.xml fuer die logging in log - datei angepasst. Log wird nach 
Einstellungen in log Verzeichnis gespeichert, diese ist in .gitignore eingetragen.