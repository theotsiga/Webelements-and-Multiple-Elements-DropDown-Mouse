package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement essentials = driver.findElement(By.xpath("//a[.='Essentials']"));
		WebElement masks = driver.findElement(By.xpath("//a[.='Masks']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(essentials).perform();
		Thread.sleep(2000);
		//act.moveToElement(masks).click().perform(); no need to move to just do a direct click
		act.click(masks).perform();
		
		   
	}

}
