package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("http://cpcats.cpctechno.com/");	
		driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		
		//count no of links
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    System.out.println("no of links are "+" "+links.size());
		
		//count no of Dropdowns
	    List<WebElement>Dropdowns=driver.findElements(By.tagName("select"));
	    System.out.println("no of Dropdowns are "+" "+Dropdowns.size());
	    		
		//count no of images
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("no of images are "+" "+images.size());
		
		//count no of Normal Text Elements
		List<WebElement>NText=driver.findElements(By.tagName("p"));
		System.out.println("no of Noramal Text Elements are "+" "+NText.size());
		
		//count no of Bold Text Elements
		List<WebElement>BText=driver.findElements(By.tagName("B"));
		System.out.println("no of Bold Text Elements are "+" "+BText.size());
		
		//count no of checkboxes
		 List<WebElement>checkboxes=driver.findElements(By.xpath("input[@type='checkbox']"));
		 System.out.println("no of checkboxes are"+" "+checkboxes.size());
			
		//count no of radiobuttons	
		 List<WebElement>radiobuttons=driver.findElements(By.xpath( "input[@type='radiobuttons']"));
	      System.out.println("no of radiobuttons are"+" "+radiobuttons.size());
	      
	   
		
		
		
		
		
	}

}
