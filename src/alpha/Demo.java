package alpha;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
		
	public static void main(String[] args) {
		
		log.debug("I have clicked on Button");
		log.info("Button is Displayed");
		log.error("Button is not Displayed");
		log.fatal("Button is Missing");
		
		
		System.out.println("Test1 Git");
		
		
	}
	
	@Test
	public void gitDemo() {
		System.out.println("Test1 Git");
	}
	
	@Test
	public void gitDemo1() {
		System.out.println("Test2 Git");
	}
	
	@Test
	public void gitDemo2() {
		System.out.println("Test3 Git");
	}

}
