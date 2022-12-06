package automation.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sai1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cpcats.cpctechno.com/");
		driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create Employee']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='create_emp']//input[@id='fname']")).sendKeys("sai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("naidu");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='create_emp']//input[@id='user_name']")).sendKeys("baba");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("sainaidukanakala@999.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='npassword']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@id='create_emp']//input[@id='con_password']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("9391857456");
		Thread.sleep(5000);
	    WebElement Dropdown=driver.findElement(By.id("privilege"));
	    Select driver1=new Select(Dropdown);
	    driver1.selectByIndex(1);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		
		
		
		
		
		
		
		

	}

}
