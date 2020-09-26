package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyCutPaste {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Theo ");
		firstname.sendKeys(Keys.CONTROL,"a");    
		firstname.sendKeys(Keys.CONTROL,"c");    //cutpaste Control,"x"
		Thread.sleep(3000);
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(3000);
		driver.close();
	
	}

}
