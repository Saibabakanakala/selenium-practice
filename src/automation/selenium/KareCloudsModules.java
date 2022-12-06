package automation.selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KareCloudsModules {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://kareclouds.com/site/login");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='logo-lg']")).click();
		driver.findElement(By.xpath("//a[@onclick='collapseSidebar()']")).click();
	    driver.findElement(By.xpath("//span[@href='#']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();		
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	    driver.findElement(By.xpath("//span[@class='spanDM']")).click(); 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='ukclose']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@class='fa fa fa-calendar']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//i[@class='fa fa-check-square-o']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	    Thread.sleep(0);
	   // driver.findElement(By.xpath("//i[@class='fa fa-sign-out fa-fw']")).click();
	    Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@href='http://kareclouds.com/admin/appointment/search']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//li[@class='treeview ']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-procedures']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-mortar-pestle']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-flask']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-microscope']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-cut']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-tint']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-umbrella']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-money-bill-wave']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-ambulance']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fa fa-angle-left pull-right']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-sitemap']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-bullhorn']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-luggage-cart']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='fas fa-cogs']")).click();
	    
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FilecopyFile(src,new File("D:\\MyWorkSpace\\SeleniumProject\\Sceenshots/img11.png"));
		 
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void FilecopyFile(File src, File file) {
		// TODO Auto-generated method stub
		
	}

}
