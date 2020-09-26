package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assFBtexffield5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		// enter using return
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testing@hotmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("testing123");
		password.sendKeys(Keys.RETURN);
	}

}
