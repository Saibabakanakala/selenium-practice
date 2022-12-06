package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NooflinksinCPC {

	public static void main(String[] args) {
		

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cpcats.cpctechno.com/");
		
		driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of Links are"+" "+links.size());
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
