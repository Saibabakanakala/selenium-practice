package automation.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("http://cpcats.cpctechno.com/");
       driver.findElement(By.id("login-username")).click();
		driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		driver.findElement(By.id("login-password")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();

      List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
      System.out.println("no of Radios are"+" "+radio.size());  
      
      
      }
     
      }
		
    	      
		
		
      
		
	


