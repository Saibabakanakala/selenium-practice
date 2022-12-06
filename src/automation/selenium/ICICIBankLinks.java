package automation.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	
	public class ICICIBankLinks {

	public static void main(String[] args) {	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.icicibank.com/");
	List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of Links are"+" "+links.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
