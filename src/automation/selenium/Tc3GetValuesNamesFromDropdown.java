package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc3GetValuesNamesFromDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");

		WebElement TypeofHoliday = driver.findElement(By.id("themes"));
		List<WebElement> values = TypeofHoliday.findElements(By.tagName("option"));
		System.out.println("no of values from Type of Holiday" + " " + values.size());

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
		}
		
		
		
		
		
		
	}

}
