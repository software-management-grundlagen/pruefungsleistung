package numbers;

import java.util.Scanner;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Klasse Ratioanal erweitert abstrakte Basisklasse {@link numbers.Zahl Zahl}
 * und implementiert vier Grundrechenarten für die Zahlen, ergänzend beinhaltet
 * die Klasse auch die Methoden für die Eingabe und Ausgabe von Zahlen, sowie
 * die weiter hier dokumentierte Methoden für die Kürzung von Bruchzahlen, deren
 * Umwandlung in dezimale Bruchzahl, sowie die weiteren notwendigen
 * manipulations Methoden wie z.B. herausfinden von grösten gemeinsamen Teiler.
 */
public class Rational extends Zahl {

	/** @param p Zähler als Integer */
	private int p;
	/** @param p Nenner als Integer */
	private int q;

	private static final Logger errorLogger = (Logger) LoggerFactory.getLogger(Rational.class);
	private static final Logger infoLogger = (Logger) LoggerFactory.getLogger("RationalInfo");

	/** Default Konstruktor */
	public Rational() {
		this.p = 1;
		this.q = 1;

	}

	/**
	 * Konstruktor nimmt eine ganze Zahl als paramater an.
	 * 
	 * @param z ein Integer als Zähler
	 */
	public Rational(int z) {
		this.p = z;
		this.q = 1;
	}

	/**
	 * Konstruktor nimmt zwei ganze Zahlen als Zähler und Nenner.
	 * 
	 * @param z ein Integer als Zähler.
	 * @param n ein Integer als Nenner.
	 */
	public Rational(int z, int n) {
		this.p = z;
		this.q = n;
		assert (n != 0);
		kuerzen();
	}

	/**
	 * Konstruktor nimmt ein Object von Typ Rational und setzt die Werte für Zähler
	 * und Nenner.
	 * 
	 * @param other ein Object von Typ Rational.
	 */
	public Rational(Rational other) {
		this(other.zaehler(), other.nenner());
	}

	/**
	 * Methode für die Ausgabe eines Bruchs auf Konsole. \return String als die
	 * Darstellung einer Bruchzahl.
	 */
	public void print() {
		System.out.println(p + "/" + q);
	}

	/**
	 * Überschreiben der Funktion toString für die Ausgabe von Bruchzahl auf die
	 * Konsole. \return String als die Darstellung einer Bruchzahl.
	 */
	@Override
	public String toString() {
		String text = "";
		text = String.valueOf(p) + "/" + String.valueOf(q);
		return text;
	}

	/** \return Integer als Zähler */
	public int zaehler() {
		return p;
	}

	/** \return Integer als Nenner */
	public int nenner() {
		return q;
	}

	/**
	 * Methode für die Addition einer Bruchzahl. Dabei wird das Ergebniss auch
	 * gekürzt.
	 */
	public void add(Zahl z) {
		Rational local = (Rational) z;
		p = p * local.q + local.p * q;
		q = q * local.q;
		kuerzen();
	}

	/** Methode für die Addition einer ganzen Zahl */
	public void add(int i) {
		Rational local = new Rational(i);
		add(local);
		kuerzen();
	}

	/**
	 * Methode für die Subtraktion mit einer Bruchzahl. Dabei wird das Ergebnis auch
	 * gekürzt.
	 */
	public void sub(Zahl z) {
		Rational local = (Rational) z;
		p = p * local.q - local.p * q;
		q = q * local.q;
		kuerzen();
	}

	/** Methode für die Subtraktion mit der ganzen Zahl */
	public void sub(int i) {
		Rational local = new Rational(i);
		sub(local);
		kuerzen();
	}

	/**
	 * Methode für die Multiplikation mit einer Bruchzahl. Dabei wird das Ergebnis
	 * auch gekürzt.
	 */
	public void mul(Zahl z) {
		Rational local = (Rational) z;
		p = p * local.p;
		q = q * local.q;
		kuerzen();
	}

	/** Methode für die Multiplikation mit der ganzen Zahl */
	public void mul(int i) {
		Rational local = new Rational(i);
		mul(local);
		kuerzen();
	}

	/**
	 * Methode für die Division mit einer Bruchzahl. Dabei wird das Ergebnis auch
	 * gekürzt.
	 */
	public void div(Zahl z) {
		Rational local = (Rational) z;
		p = p * local.q;
		q = q * local.p;
		kuerzen();
	}

	/** Methode für die Division mit der ganzen Zahl */
	public void div(int i) {
		Rational local = new Rational(i);
		div(local);
		kuerzen();
	}

	/** Methode zum ermitteln von Kehrwert einer Bruchzahl */
	public void kehrwert() {
		int temp = p;
		p = q;
		q = temp;
		assert (q != 0);
	}

	/** Methode zum ändern von Vorzeichen einer Zahl */
	public void switchSign() {
		p = -p;
	}

	/** Funktion für die Kürzung von Bruchzahl */
	public void kuerzen() {
		infoLogger.info("kuerzen() ist gestartet");
		// Vorzeichen merken und Betrag bilden
		int sign = 1;
		if (p < 0) {
			sign = -sign;
			p = -p;
		}
		if (q < 0) {
			sign = -sign;
			q = -q;
		}
		
		int	teiler = ggt(p, q);
		
		if (teiler == 0) // Zwar hier unmoeglich, aber trotzdem...
		{
			errorLogger.error("ggt(): Teiler war 0");
			infoLogger.info("ggt(): Anwendung wird beendet");
			System.exit(1);
		}

		// Vorzeichen restaurieren
		p = sign * p / teiler;
		q = q / teiler;

		infoLogger.info("kuerzen() ist beendet.");
	}

	/**
	 * Methode wandelt eine Bruchzahl in Dezimalbruch. \return Double als
	 * Dezimalbruch.
	 * 
	 * @return
	 */
	public double getDoubleWert() {
		return (double) p / (double) q;
	}

	/**
	 * Funktion überprüft ob eine Bruchzahl in eine ganze/natürliche Zahl
	 * umgewandelt werdenn kann. \return True für den Fall wenn Zähler durch Nenner
	 * ohne Rest geteilt wird.
	 * 
	 * @return
	 */
	public boolean isInteger() {
		if (p % q == 0)
			return true;
		else
			return false;
	}

	/**
	 * Funktion für die Berechnung von grössten gemeinsamen Teiler \return Integer
	 */
	private int ggt(int x, int y) {
		infoLogger.info("ggt() ist gestartet");
		if (x == 0 || y == 0) {
			errorLogger.error("Methode ggt(): Es wurde eine 0 eingegeben -> x = " + x + " y = " + y);
		}
		while (y > 0) {
			int rest = x % y;
			x = y;
			y = rest;
		}
		infoLogger.info("ggt() Ergebniss: " + x + " ist zurueck gegeben");
		infoLogger.info("ggt() ist beendet");
		return x;

	}

	/**
	 * Funktion für die Addition von zwei Rationalen Zahlen \return Objekt von Typ
	 * "Rational"
	 */
	public Rational add(Rational a, Rational b) {

		a.add(b);
		return a;

	}

	/**
	 * Funktion für die Subtraktion von zwei Rationalen Zahlen \return Objekt von
	 * Typ "Rational"
	 */
	public Rational sub(Rational a, Rational b) {

		a.sub(b);
		return a;

	}

	/**
	 * Funktion für die Division von zwei Rationalen Zahlen \return Objekt von Typ
	 * "Rational"
	 */
	public Rational div(Rational a, Rational b) {

		a.div(b);
		return a;

	}

	/**
	 * Funktion für die Multiplikation von zwei Rationalen Zahlen \return Objekt von
	 * Typ "Rational"
	 */
	public Rational mul(Rational a, Rational b) {

		a.mul(b);
		return a;

	}

	/**
	 * Methode liest die Eingaben für Zähler und Nenner von Konsole ab und gibt ein
	 * Ergebnis in Form eines gekürzten Bruches auf die Konsole aus.
	 */
	public void eingabe() {

		infoLogger.info("eingabe() ist gestartet");

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Geben Sie den Zaehler ein:");
			int i = sc.nextInt();
			p = i;

			System.out.println("Geben Sie den Nenner ein:");
			i = sc.nextInt();
			q = i;

			if (q == 0) {
				errorLogger.error("Methode eingabe(): es wurde eine 0 fuer nenner eingegeben -> q=" + q);
				sc.close();
				throw new Exception();
			}
			sc.close();

			System.out.println("Ergebniss:");
			kuerzen();
			print();
			infoLogger.info("eingabe() ist beendet");
		} catch (Exception ex) {
			if (!(q == 0 || p == 0)) {
				errorLogger.error("Methode eingabe(): Bei der Eingabe handelte es sich nicht um eine Zahl.\n");
			}
			ex.printStackTrace();
		}
	}

	/**
	 * \mainpage
	 * <h1>SMG ZahlenAufgabe</h1>
	 *
	 * <h3>Einfache Anwendung für die Kürzung von Benutzer eingegebenen
	 * Bruchzahl.</h3>
	 *
	 * \image html bruch.png
	 *
	 * Die Anwendung "ZahlenAufgaben" liest nach dem ausführen die Eingaben von
	 * Benutzer/in für Zähler und Nenner und gibt das Ergebnis in Form einer
	 * gekürzten Bruchzahls aus. Die Eingabe sowie die Ausgabe erfolgt über die
	 * Konsole.
	 *
	 * Die Methoden für die Manipulation mit den Zahlen sowie deren Ein/Ausgabe als
	 * auch dieser Text ist in Rational.java zu finden. Etwas konkreter
	 * implementiert Rational.java vier Grundrechenarten für die Zahlen und
	 * ergänzend dazu beinhaltet auch die Methoden für die Eingabe und Ausgabe von
	 * Zahlen, sowie weitere Methoden für die Kürzung von Bruchzahlen, deren
	 * Umwandlung in eine dezimale Bruchzahl, sowie die weiteren notwendigen
	 * manipulations Methoden wie z.B. herausfinden von grösten gemeinsamen Teiler.
	 */

	/**
	 * \example App.java \image html bruch_demo.gif "ZahlenAufgabe - Demonstration"
	 * Dabei handelt es sich um eine Demonstration von Anwendung selbs. Die Main -
	 * Methode besteht aus Begrüßung und Verabschiedung mittels Konsolenausgabe mit
	 * System.out.println sowie den Einsatz von Methode eingabe() von der Klasse
	 * "Rational". Die Methode eingabe() ruft die Methoden, kuerzen() und print()
	 * denselben Klassen und beinhaltet Logik für die Eingabe von Zähler und Nenner,
	 * sowie deren Kürzung und ausgabe aufgrund der Aufruf von oben genannten
	 * Methoden
	 * 
	 * 
	 */
}
