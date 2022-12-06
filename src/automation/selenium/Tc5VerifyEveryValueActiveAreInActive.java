package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc5VerifyEveryValueActiveAreInActive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		    driver.get("https://www.mercurytravels.co.in/");
		
		 WebElement TypeofHoliday=driver.findElement(By.id("themes"));
		 List<WebElement>values=TypeofHoliday.findElements(By.tagName("option"));
		 for(int i=0;i<values.size();i++) {
		 String vname=values.get(i).getText();
		 values.get(i).click();
		
		if(values.get(i).isDisplayed()) {
		
		 System.out.println(vname+" "+"Active"); 
		 }
		 else {
			 System.out.println(vname+" "+"InActive");
		 }
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
