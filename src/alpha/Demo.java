package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
		
	public static void main(String[] args) {
		
		log.debug("I have clicked on Button");
		log.info("Button is Displayed");
		log.error("Button is not Displayed");
		log.fatal("Button is Missing");
		
	}

}
