package multiplewebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssSearchEnginesMakeMyTrip {
		
			public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.makemytrip.com"); 
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='fromCity']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='From']")).click();
			
	}
			

}
