package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CPCcountnumberofNormalTextandBoldTextElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();	
		driver.get("http://cpcats.cpctechno.com/");	
		driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		
	List<WebElement>NText=driver.findElements(By.tagName("P"));
	System.out.println("no of Normal Text Elements are"+" "+NText.size());
	
	List<WebElement>BText=driver.findElements(By.tagName("B"));
	System.out.println("no of Bold Text Elements are "+" "+BText.size());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
