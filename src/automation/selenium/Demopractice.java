package automation.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demopractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	
	Actions action=new Actions(driver);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sainaidukanakala");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.id("radio1")).sendKeys("gender");
	Thread.sleep(2000);
	driver.findElement(By.id("radio2")).sendKeys("female");
	Thread.sleep(2000);
	driver.findElement(By.id("alert1")).sendKeys("sai");
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(2000);
	//checkboxes
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(2000);
	//radio buttons
	driver.findElement(By.xpath("//input[@type='radio']")).click();

	driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='button']")).click();
	driver.findElement(By.id("prompt")).sendKeys("sai");
	Thread.sleep(2000);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
