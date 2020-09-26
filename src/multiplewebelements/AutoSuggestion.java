package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.uk/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
			Thread.sleep(5000);
			List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
			System.out.println(suggestions.size());
			
			/*for (int i = 0; i < suggestions.size(); i++) {
				System.out.println(suggestions.get(i).getText());
				suggestions.get(3).click();*/
			
			for (int i = 0; i < suggestions.size(); i++) {
				
				if (suggestions.get(i).getText().equalsIgnoreCase("selenium python")) {
					suggestions.get(i).click();
					break;
			}
			}
	}

}
