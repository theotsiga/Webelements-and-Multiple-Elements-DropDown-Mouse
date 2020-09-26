package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		System.out.println(firstname.getLocation());
		
		driver.close();
	}

}
