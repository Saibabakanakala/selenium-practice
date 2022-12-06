package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("http://cpcats.cpctechno.com/admin/index");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("http://kareclouds.com/site/login");
		driver.close();
				
		

	}

}
