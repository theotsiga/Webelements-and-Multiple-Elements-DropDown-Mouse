package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assFBtextfield4 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("medona");
		
		// enter 3 names in the field with space
		
		String x=firstname.getAttribute("value");
		Thread.sleep(3000);
		firstname.sendKeys(Keys.ARROW_UP);
		Thread.sleep(3000);
		firstname.sendKeys("Kalyani ");
		       for(int i=0;  i<x.length();  i++) {
		firstname.sendKeys(Keys.ARROW_RIGHT);
		    }
		firstname.sendKeys(" Jeeva");
		
		
		
	}

}
