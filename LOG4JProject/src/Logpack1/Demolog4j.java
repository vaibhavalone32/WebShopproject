package Logpack1;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Demolog4j {

	static Logger log = Logger.getLogger(Demolog4j.class.getName());

	public static void main(String[] args) throws IOException {

		// BasicConfigurator.configure();
		// Layout l = new SimpleLayout();

		// Layout l = new HTMLLayout();
		// Layout l = new XMLLayout();

		// Layout l = new PatternLayout();

		// Appender ap = new FileAppender(l, "abc.txt");
		// Appender ap = new ConsoleAppender(l);

		// log.addAppender(ap);
		// log.debug("DEBU");

		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		System.out.println("welcome ");

	}

}
