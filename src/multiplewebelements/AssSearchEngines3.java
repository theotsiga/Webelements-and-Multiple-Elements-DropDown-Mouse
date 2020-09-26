package multiplewebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssSearchEngines3 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.bing.com/");
			driver.manage().window().maximize();
			
			WebElement nike = driver.findElement(By.xpath("//input[@type='search']"));
			nike.sendKeys("nikes");
			Thread.sleep(2000);
			for (int i = 0; i < 5 ; i++) {
			Thread.sleep(2000);
			//nike.sendKeys(Keys.HOME);
			Thread.sleep(2000);
			//nike.sendKeys(Keys.ARROW_RIGHT);
			Thread.sleep(2000);
			nike.sendKeys(Keys.BACK_SPACE);
			}
	}

}
