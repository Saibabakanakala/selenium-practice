
package automation.selenium;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesofDatamanagementCpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   System.setProperty("webdriver.driver.chrome", "chrome.exe");
	   WebDriver driver=new ChromeDriver();
       driver.get("http://cpcats.cpctechno.com/");
	   driver.findElement(By.id("login-username")).click();
	   driver.findElement(By.id("login-username")).sendKeys("cpctechnosolutions");
	   driver.findElement(By.id("login-password")).sendKeys("Test@123");
       driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[1]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[2]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[3]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[4]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[5]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[6]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[7]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[8]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[9]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[10]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[11]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[12]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[13]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[14]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[15]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[16]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[17]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[18]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[19]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[20]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[21]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[22]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[23]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[24]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[25]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[26]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[27]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[28]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[29]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[30]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[31]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[32]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[33]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[34]/a")).click();
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div/ul/li[11]/ul/li[35]/a")).click();
       
       
       List<WebElement>checkboxes=driver.findElements(By.tagName("//input[@type='checkbox']"));
	   System.out.println("no of checkboxes are"+" "+checkboxes.size());
		 

	   List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type='radiobuttons']"));
	   System.out.println("no of radiobuttons are"+" "+radiobuttons.size());
	

	   for(int i=0;i<=checkboxes.size();i++) {
	   String names=checkboxes.get(i) .getAttribute("name");
	   WebElement button=driver.findElement(By.name(names));
	   button.click();
	   if(button.isSelected()) {
	   System.out.println("checkbox is selected");
	 }
	   else {
	   System.out.println("checkbox is not selected");
	 }
			
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
