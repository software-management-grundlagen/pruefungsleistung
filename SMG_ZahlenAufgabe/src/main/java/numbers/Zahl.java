package numbers;

/**
 * Abstrakte Basisklasse für die vier Grundrechenarten: addieren, subtrahieren, multiplizieren und dividieren.
 * Die Metoden sind in {@link numbers.Rational Rational} - Klasse in package {@link numbers numbers} definiert.
 */
public abstract class Zahl {
	
	/**Methode für die Addition von Zahlen.*/
	 public abstract void add(Zahl a);
	 
	/**Methode für die Subtraktion von Zahlen.*/
	 public abstract void sub(Zahl z);
	 
	/**Methode für die Multiplikation von Zahlen.*/
	 public abstract void mul(Zahl z);
	 
	/**Methode für die Division von Zahlen.*/
	 public abstract void div(Zahl z);	 
		 
	 /**Methode zum ausgeben von Zahlen.*/
	 public abstract void print();
}
