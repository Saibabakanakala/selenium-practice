package automation.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountnumberofDropDowns {

	public CountnumberofDropDowns() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in/");
	List<WebElement>ListBox=driver.findElements(By.tagName("select"));
	System.out.println(ListBox.size());
	for(int i=0;i<=ListBox.size();i++) {
	System.out.println(ListBox.get(i).getAttribute("name"));
	
	
	
			
	
	
		
		
	}
		
		}
		

	}


