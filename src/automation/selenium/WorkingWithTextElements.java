package automation.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithTextElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		    List<WebElement>NText=driver.findElements(By.tagName("p"));
		    System.out.println("no of normal Text Elements are "+" "+NText.size());
		    List<WebElement>BText=driver.findElements(By.tagName("B"));
		    System.out.println("no of Bold Text Elements are "+" "+BText.size());
		    
		    
	}

}
