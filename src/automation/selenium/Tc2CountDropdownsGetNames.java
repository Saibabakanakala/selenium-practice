package automation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Tc2CountDropdownsGetNames {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.mercurytravels.co.in/");
		
    List<WebElement>Dropdowns=driver.findElements(By.tagName("select"));
    System.out.println("no of Dropdowns are "+" "+Dropdowns.size());
	for(int i=0;i<Dropdowns.size();i++) {
	System.out.println(Dropdowns.get(i).getAttribute("name"));
	
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
