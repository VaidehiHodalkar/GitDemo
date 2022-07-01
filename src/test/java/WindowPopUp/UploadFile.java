package WindowPopUp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//C:\\selenium\\Work\\chromedriver.exe");  
		
		 WebDriver driver=new ChromeDriver();  
		 driver.navigate().to("https://online2pdf.com/text-to-pdf#"); 
		 //Thread.sleep(6000L);
		 driver.findElement(By.xpath("//*[@id=\"div_file_box0_0\"]/div[1]/div[1]/table/tbody/tr/td/div[1]/button")).click();
		 Thread.sleep(5000L);
         Runtime.getRuntime().exec("C:\\Users\\vaish\\Desktop\\New folder\\Uploadfile.exe");
         Thread.sleep(5000L);
         driver.findElement(By.xpath("//*[@id=\"main_window\"]/form/div[3]/button")).click();
         File f=new File("C:\\Users\\vaish\\Downloads\\Selenium Partices.pdf");
         if(f.exists())
         {
        	 System.out.println("File Found");
        	 
         }
         else 
         {
        	 System.out.println("File not found");
         }
	}

}
