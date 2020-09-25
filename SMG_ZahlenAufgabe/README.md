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
