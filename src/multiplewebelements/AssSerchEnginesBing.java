package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssSerchEnginesBing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("nike");
		Thread.sleep(2000);
		List<WebElement> nike = driver.findElements(By.xpath("//span[contains(text(),'nike')]"));
		
		
		//nike.get(3).click();
		
		for (int i = 0; i < nike.size(); i++) {
			
			/*if (nike.get(i).getText().contains("uk")) {
				nike.get(i).click();*/
			
			if (nike.get(i).getText().equalsIgnoreCase("nike store")) {    //// recommended method 
				nike.get(i).click();
			}
			}
		}
		
		
	}


