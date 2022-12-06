package automation.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxesTimeSheetinCpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     WebDriver driver=new ChromeDriver();
	     driver.get("http://cpcats.cpctechno.com/");
		 driver.findElement(By.id("login-username")).click();
		 driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
		 driver.findElement(By.id("login-password")).sendKeys("Test@123");
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[7]/a/span[1]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[7]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[7]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[7]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[7]/ul/li[4]/a")).click();
		
		
		
		
        List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
      		System.out.println("no of checkboxes are"+" "+checkboxes.size());
      		 
      		 
      		 
      		 List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type='radiobuttons']"));
      		 System.out.println("no of radiobuttons are"+" "+radiobuttons.size());
      		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
