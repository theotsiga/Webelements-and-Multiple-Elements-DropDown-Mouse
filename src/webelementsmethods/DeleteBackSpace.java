package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteBackSpace {


		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.facebook.com");
					driver.manage().window().maximize();
					
					WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
					firstname.sendKeys("Theo");
					//firstname.sendKeys(Keys.CONTROL,"a");
					///Thread.sleep(8000);
					//firstname.sendKeys(Keys.DELETE);
					////Thread.sleep(8000);
					///firstname.sendKeys(Keys.CONTROL,"a");
					///firstname.sendKeys(Keys.BACK_SPACE);
					for (int i = 0; i < 2 ; i++) { 
					firstname.sendKeys(Keys.ARROW_RIGHT);
					Thread.sleep(2000);
					firstname.sendKeys(Keys.BACK_SPACE); 
					Thread.sleep(2000);
					driver.close();
					
		}
	}

}
