package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);

	driver.findElement(By.name("username")).click();
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	List<WebElement>dropdowns=driver.findElements(By.tagName("select"));
	System.out.println(dropdowns.size());
	
	List<WebElement>images=driver.findElements(By.tagName("img"));
	System.out.println("no of images are "+" "+images.size());
	
	List<WebElement>rows=driver.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	
	List<WebElement>columns=driver.findElements(By.tagName("td"));
	System.out.println(columns.size());
	
	List<WebElement>NText=driver.findElements(By.tagName("p"));
	System.out.println(NText.size());
	
	List<WebElement>BText=driver.findElements(By.tagName("B"));
	System.out.println(BText.size());
	
	
	}

}
