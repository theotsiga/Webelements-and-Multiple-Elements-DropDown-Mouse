package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assFBtextfield2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//add Miss
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Medona");
		
		firstname.sendKeys(Keys.HOME);
		Thread.sleep(3000);
		firstname.sendKeys("Miss");
		firstname.sendKeys(Keys.SPACE);
		
		/*String a = firstname.getAttribute("value");
		for (int i = 6; i < a.length(); i++) {
			firstname.sendKeys(Keys.HOME);
			firstname.sendKeys("i");*/    ///dead code
		}
	}
	

