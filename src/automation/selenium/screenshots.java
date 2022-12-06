package automation.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://kareclouds.com/site/login");
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C:\\Users\\Hp\\eclipse-workspace\\seleniumpractice\\Screenshots/img.png"));
//		
//		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Hp\\eclipse-workspace\\seleniumpractice\\Screenshots/img2.png"));
		
		
		
		
		
		
		
		
		

	}

	
	}


