package automation.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNumberofImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    List<WebElement>images=driver.findElements(By.tagName("img"));
    System.out.println("no of images are "+" "+images.size());
    for(int i=0;i<=images.size();i++) {
    	System.out.println(images.get(i).getAttribute("src"));
    }
    

		
	
		
		
		
		
		
	 }
		
	 }	
		
		
		
		
	


