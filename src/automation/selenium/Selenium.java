package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://cpcats.cpctechno.com/admin/index");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		
		driver.get("http://kareclouds.com/site/login");
		driver.close();
        
	}

}
