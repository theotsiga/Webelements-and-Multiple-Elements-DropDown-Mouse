package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement doubleclick = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Actions act = new Actions(driver);
		act.click(doubleclick).perform();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.close();
	}

}
