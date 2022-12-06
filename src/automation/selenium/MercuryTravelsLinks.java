package automation.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class MercuryTravelsLinks {

	public MercuryTravelsLinks() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open browser navigate to page
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("no of Links"+" "+Links.size());
		for(int i=0;i<=Links.size();i++) {
			System.out.println(Links.get(i).getText());
		}
				
	}

}
	
	
	
	

