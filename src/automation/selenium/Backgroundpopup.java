
package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backgroundpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URL ="http://omayo.blogspot.com/";
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		String getTitleofThePage=driver.getTitle();
		String getCurrentofThepage =driver.getCurrentUrl();
		
		System.out.println(getTitleofThePage);
		System.out.println(getCurrentofThepage);
		
		
		
		
		
		
		
		
		
	}

}
