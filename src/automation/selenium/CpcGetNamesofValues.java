package automation.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CpcGetNamesofValues {

	    public static void main(String[] args) {
		
		 System.setProperty("webdriver.driver.chrome", "chrome.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://cpcats.cpctechno.com/");
	     driver.findElement(By.id("login-username")).click();
		 driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		 driver.findElement(By.id("login-password")).sendKeys("Test@123");
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		 List<WebElement>listBox=driver.findElements(By.xpath("//span[@class='title']"));
		 System.out.println("no of total values"+" "+listBox.size());
		 for(int i=0;i<listBox.size();i++) 
		  {
		 	 //obtain text
			String s=listBox.get(i).getText() ;
			System.out.println("Text is "+ s);
			
			
				
		  }
		
		
		  }
		
		
		
	}


