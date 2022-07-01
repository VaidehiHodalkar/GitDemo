package Beta;
import org.apache.logging.log4j.*;

public class Demo2 {
	
	 /* Get the class name to be printed on */   
	  
	   
	   private static Logger log =LogManager.getLogger(Demo2.class.getName());
	     
	   public static void main(String[] args){  
		   
	      log.debug("Hello this is a debug message");
	      if(5>4)
	      log.info("Hello this is an info message");  
	      log.error("objrct is not presnt");
	      log.fatal("this is fatal");

}
}
