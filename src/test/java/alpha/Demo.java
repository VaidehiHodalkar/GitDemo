package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {


	   private static Logger log =LogManager.getLogger(Demo.class.getName());
	     
	   public static void main(String[] args){  
		   
	      log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message"); 
	
}
}
