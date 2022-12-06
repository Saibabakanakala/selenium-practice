package automation.selenium;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateEmployee {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.driver.chrome", "chrome.exe");
		ChromeDriver cpc=new ChromeDriver();
		cpc.get("http://cpcats.cpctechno.com/");
		cpc.findElement(By.id("login-username")).click();
		cpc.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		cpc.findElement(By.id("login-password")).sendKeys("Test@123");
	    cpc.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		
		
		

		
		 
		 List<WebElement>listBox=cpc.findElements(By.xpath("//span[@class='title']"));
			System.out.println("no of total dropdownd"+" "+listBox.size());
			  for(int i=0;i<listBox.size();i++) 
			  {
				 //obtain text
				String s=listBox.get(i).getText() ;
				System.out.println("Text is "+ s);
			
		
		
		  }
		
		
	}
		 
		  
} 
		 
		 
		 
		 
		 
		 
		
		
		
		
			  
		
		
		
		
			  
		
		
		
		
		
		
	


