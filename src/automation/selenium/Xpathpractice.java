package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpractice {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.mercurytravels.co.in/");
			driver.manage().window().maximize();
			
						
		
		driver.findElement(By.id("flights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("fromCity")).sendKeys("Hyderabad, India - Hyderabad International Airport (HYD)");
		Thread.sleep(2000);
		driver.findElement(By.name("toCity")).sendKeys("Benghazi, Libya - Benina Intl (BEN)");
		Thread.sleep(3000);
		
		driver.findElement(By.id("dpf1")).sendKeys("18/11/2022");
		Thread.sleep(2000);
		driver.findElement(By.id("dpf2")).sendKeys("30/11/2022");
		Thread.sleep(2000);
		driver.findElement(By.id("Adults")).sendKeys("9");
		Thread.sleep(2000);
		driver.findElement(By.id("Childs")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.id("Infants")).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.name("cabinClass")).sendKeys("First Class");
		Thread.sleep(2000);
		driver.findElement(By.id("searchFlightsBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
