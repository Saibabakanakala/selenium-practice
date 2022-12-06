package automation.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIvisibleLinksTotalnofLinksHiddenLinks {

	public ICICIvisibleLinksTotalnofLinksHiddenLinks() {
		
	
	}
	public static void main(String[] args) {
		
																																																																					// open browser navigate to page
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).isDisplayed());
			count++;
			
		}
		System.out.println("no of links are"+" "+Links.size());
        System.out.println("no of visible links  are "+" "+count);
        System.out.println("no of hidden links are "+" "+(Links.size()-count));
        
		
		
		
		
		
			}
	
	
	
	

		
	


	}




