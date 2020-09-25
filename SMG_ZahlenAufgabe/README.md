## Aenderungsverlauf

[maven 5989e5d] "Anpassen des Projekts an Maven-Projekt-Struktur"
 4 files changed, 12 insertions(+)
 create mode 100644 SMG_ZahlenAufgabe/pom.xml
 rename SMG_ZahlenAufgabe/src/{ => main/java}/App.java (100%)
 rename SMG_ZahlenAufgabe/src/{ => main/java}/numbers/Rational.java (100%)
 rename SMG_ZahlenAufgabe/src/{ => main/java}/numbers/Zahl.java (100%)

[maven deb9969] "Einfuegen und erstellen von Projekt conf. Dateien"
 6 files changed, 100 insertions(+)
 create mode 100644 SMG_ZahlenAufgabe/.classpath
 create mode 100644 SMG_ZahlenAufgabe/.gitignore
 create mode 100644 SMG_ZahlenAufgabe/.project
 create mode 100644 SMG_ZahlenAufgabe/.settings/org.eclipse.jdt.apt.core.prefs
 create mode 100644 SMG_ZahlenAufgabe/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 SMG_ZahlenAufgabe/.settings/org.eclipse.m2e.core.prefs

[maven edc9d6a] "Einfuegen von properties und dependencies tags zu pom.xml"
 1 file changed, 9 insertions(+)

[maven 1613acd] "Einfuegen von build mit plugin management zu pom.xml"
 1 file changed, 45 insertions(+)

[maven e09c06d] "Anpassen von jdk - version von 1.8 auf 11"
 3 files changed, 6 insertions(+), 6 deletions(-)

[maven 4c1b740] "Einfuegen von Doxygen - plugin zu pom.xml"
 1 file changed, 90 insertions(+), 66 deletions(-)
 rewrite SMG_ZahlenAufgabe/pom.xml (83%)

[maven 8216efb] "Einfuegen von Doxyfile"
 1 file changed, 2579 insertions(+)
 create mode 100644 SMG_ZahlenAufgabe/Doxyfile

[maven 2809031] "Einfuegen von Bilder fuer die Dokumentation mit Doxygen"
 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 SMG_ZahlenAufgabe/src/main/resources/img/doxygen/bruch.png
 create mode 100644 SMG_ZahlenAufgabe/src/main/resources/img/doxygen/bruch_demo.gif

[maven 1cb6c12] "RationalTest.java ist nach /src/test/numbers kopiert"
 1 file changed, 155 insertions(+)
 create mode 100644 SMG_ZahlenAufgabe/src/test/java/numbers/RationalTest.java

[maven fa7d590] "Einfuegen von dependency fuer junit"
 1 file changed, 8 insertions(+), 1 deletion(-)

git tag release4
git push origin release4

## Zusammenfassung fuer die Aufgabe: "Maven als Build-Werkzeug" (Aufgabe wurde gemacht vor der Aufgabe fuer LOGBack)
Nachdem Erstellen von maven-branch wurde die Projektstruktur zu der Mavenstruktur angepasst und als nächstes pom.xml
eingefuegt. Das Projekt wurde mit visual studio code zu Eclipse - Projekt angepasst. Zu der pom.xml wurde als nächstes
die Build-Plugins eingefügt als auch Doxygen - Plugin. Die Einstellungen fuer Doxygen wurden in Doxyfile angepasst, dies betrifft INPUT, IMAGE_PATH, EXAMPLE_PATH und OUTPUT_DIRECTORY. Die Dokumentation wird nach dem ausfueren von 
"mvn doxygen:generate" in target/site als SMG_ZahlenAufgabe gespeichert. Target selbst ist in .gitignore eingetragen.
Nach der Ueberpruefung der mvn - befehele wurde der RationalTest. java nach src/test/numbers eingefuegt, eine Abhaengigkeit
fuer junit wurde dementsprechend nach pom.xml eingetragen. Alle Tests sind ohne fehler gelaufen.


