package mouseoperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickRightClickKeyboarboardRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		Robot r = new Robot();
			
		for (int i = 0; i <= 3; i++) 
		{
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);*/
		
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads");
		
		WebElement rightclick =  driver.findElement(By.xpath("//a[contains(text(),'other languages exist')]"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 6; i++) 
		{
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_DOWN);	
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
		
	}
	































































































