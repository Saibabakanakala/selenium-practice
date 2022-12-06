package automation.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://omayo.blogspot.com/");
		// parent window
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window id=>" + parentwindow);
		// childwindow
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();

		Set<String> allwindows = driver.getWindowHandles();// to store multiple window
		System.out.println(allwindows);
		Iterator<String> itr = allwindows.iterator();
		while (itr.hasNext())
			{
			String win = itr.next();// Separate window will be there
			driver.switchTo().window(win);
			if (driver.getTitle().equals("Basic Web Page Title"))
			{
				String value = driver.findElement(By.id("para1")).getText();
				System.out.println("text in the window" + value);
                break;
			} else 
			{
				System.out.println("title not matched");

			
			}

		}
	}

}
