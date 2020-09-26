package multiplewebelements;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSearchEngines {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		WebElement suggestions = driver.findElement(By.xpath("//input[@type='text']"));
		suggestions.sendKeys("bb");
		Thread.sleep(1000);
	    suggestions.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		suggestions.sendKeys(Keys.ENTER);
	}
	}

		
			


