package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in/");
	
	WebElement Tholiday=driver.findElement(By.id("themes"));
	Tholiday.sendKeys("Family");
	
	Select st=new Select(driver.findElement(By.name("theme")));
	st.selectByIndex(4);
	Thread.sleep(2000);
	st.selectByVisibleText("Family");
	
		
		}
		
		
		}
				
		
		
		
		

	


