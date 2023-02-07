package QATraining.QATraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		System.out.println(" Title of the current TAB : "    + driver.getTitle());
		System.out.println("url of the current TAB :   "  + driver.getCurrentUrl());
		
	WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	username.sendKeys("TestUsername");
	WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	password.sendKeys("TestPassword@123");
	WebElement login_btn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	login_btn.click();
	System.out.println("title of the page :  " + driver.getTitle());
	driver.close();
			
	}
	
	
	
	
	
	
	
	
	
	
	

}
