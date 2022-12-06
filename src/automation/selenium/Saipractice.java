package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Saipractice {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://cpcats.cpctechno.com/admin/index");
	
	driver.findElement(By.id("login-username")).click();
	driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
	driver.findElement(By.id("login-password")).sendKeys("Test@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
	driver.findElement(By.xpath("(//a[@href='javascript:;'])[5]")).click();
	driver.findElement(By.xpath("(//a[normalize-space()='Create Employee'])[1]")).click();
	driver.findElement(By.xpath("(//a[normalize-space()='Add Employee'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//form[@id='create_emp']//input[@id='fname']")).sendKeys("sainaidu");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='lname'])[1]")).sendKeys("kanakala");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='user_name'])[28]")).sendKeys("saiqa");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='email_address'])[1]")).sendKeys("sainaidukanakala@gmal.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='npassword'])[1]")).sendKeys("@8883494777");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='con_password'])[28]")).sendKeys("@8883494777");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@id='contact'])[1]")).sendKeys("8883494777");
	Thread.sleep(3000);
	WebElement Dropdown=driver.findElement(By.id("privilege"));
	Select driver1=new Select(Dropdown);
	driver1.selectByIndex(1);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
	
		
		
		
		


	}

}
