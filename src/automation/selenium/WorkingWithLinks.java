package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public WorkingWithLinks() {
		
	}

	public static void main(String[] args) {
		
		//open browser navigate to page
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		//click on link
		driver.findElement(By.linkText("Gmail")).click();
		//verify title
		String Expected=driver.getTitle();
		String Actual="Gmail";
		System.out.println(Expected);
		if(Expected.contains(Actual)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
