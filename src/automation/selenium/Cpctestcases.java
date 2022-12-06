package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpctestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "chrome.exe");
		ChromeDriver cpc=new ChromeDriver();
		cpc.get("http://cpcats.cpctechno.com/");
		cpc.findElement(By.id("login-username")).click();
		cpc.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		cpc.findElement(By.id("login-password")).sendKeys("Test@123");
	    cpc.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		
		
		
		
		
	}
	
}
