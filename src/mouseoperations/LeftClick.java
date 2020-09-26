package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement leftclick = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Actions act = new Actions(driver);
		act.click(leftclick).perform();
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234567");
		Thread.sleep(5000);
		driver.close();
	}

}
