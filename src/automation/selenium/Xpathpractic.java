package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\seleniumpractice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"ta1\"]")).sendKeys("sainaidukanakala");
		driver.findElement(By.id("but2")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sainaidukanakala@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@8883494777");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.name("q")).sendKeys("sainaidu");
		driver.findElement(By.name("textboxn")).sendKeys("sai");
		driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.className("classone")).sendKeys("naidu");
		
		   
	}

}
