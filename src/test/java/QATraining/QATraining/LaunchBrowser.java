package QATraining.QATraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
	        WebElement sipf = driver.findElement(By.id("user-message"));
	        sipf.sendKeys("ChromeBrowser Launched Successfully");
	        
	      
	        WebElement submit_btn = driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[1]"));
	        submit_btn.click();
	        
	        String yourmesg = driver.findElement(By.id("display")).getText();
	        
  if (yourmesg.equals("ChromeBrowser Launched Successfully") ) {
	  
		System.out.println("Validation Success");		
			} else {
				System.out.println("Validation Failed");

			}
	        
	}

}
