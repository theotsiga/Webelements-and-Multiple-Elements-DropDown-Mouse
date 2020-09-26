package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.actitime.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		//password.sendKeys(Keys.ENTER);
		password.sendKeys(Keys.RETURN);
		driver.close();
	
	}

}
