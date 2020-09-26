package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.titleIs("jeeva")); ----- Timeout exception 
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		
		//wait.until(ExpectedConditions.titleIs("Enter time-Track"));----- has to use the same or us contains 
		//wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=Username")));
		
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]"
				+ "//div[@class='popup_menu_icon']//*[local-name()='svg']")).click();
		
				
				
	}

}
