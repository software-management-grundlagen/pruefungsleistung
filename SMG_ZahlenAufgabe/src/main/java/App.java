import numbers.Rational;

import ch.qos.logback.classic.Logger;

import org.slf4j.LoggerFactory;


public class App {
    private static final Logger logger 
          = (Logger) LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {        
       
        logger.info("Main ist gestartet.");
       
        System.out.println("\nHallo !!! mit diesem App wird die eingegebene Bruch gekuerzt !!!\n");
        new Rational().eingabe();
        System.out.println("\nVielen Dank fuer die Benutzung und Aufwiedersehen!!!\n");

        logger.info("Main ist beendet.");
    }
}
