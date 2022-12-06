package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tc1 {
    public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.mercurytravels.co.in/");
	WebElement Dropdown=driver.findElement(By.id("themes"));
	Dropdown.sendKeys("Family")	;	
	Select obj=new Select(Dropdown);
    obj.selectByVisibleText("Nature");
	
	obj.selectByIndex(5);
	
}

}
