package WindowPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOIT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "//C:\\selenium\\Work\\chromedriver.exe");  
			
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://admin:admin@the-internet.herokuapp.com/"); 
		 Thread.sleep(5000L);
				 driver.findElement(By.linkText("Basic Auth")).click();
	}
}
