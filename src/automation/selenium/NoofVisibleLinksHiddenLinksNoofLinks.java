package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofVisibleLinksHiddenLinksNoofLinks {

	public static void main(String[] args) {
	
   
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cpcats.cpctechno.com/");
		driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<=links.size();i++) {
		if(links.get(i).isDisplayed())	;
		{
		
		count++;
		
	}
  System.out.println("no of links are "+" "+links.size());
  System.out.println("no of visible links are "+" "+count);	
  System.out.println("no of hidden links are "+" "+(links.size()-count));	
		
	}
		
	}		
}
