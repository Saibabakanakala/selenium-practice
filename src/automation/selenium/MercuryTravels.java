package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MercuryTravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver.get("https://www.mercurytravels.co.in/");
	
	driver.findElement(By.id("holiday_category_id")).click();
	driver.findElement(By.id("holiday_category_id")).sendKeys("Hyderabad,India(469)");
	driver.findElement(By.id("dphh1")).click();
	driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[3]/td[2]")).click();
	driver.findElement(By.id("duration_d")).click();

	driver.findElement(By.id("duration_d")).sendKeys("7Nights/8Days");
	driver.findElement(By.id("themes")).sendKeys("Family");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[normalize-space()='SEARCH HOLIDAYS'])[1]")).click();




	driver.findElement(By.id("holiday_category_id")).click();
	driver.findElement(By.xpath("//input[@id='holiday_category_id']")).click();



	}

}
