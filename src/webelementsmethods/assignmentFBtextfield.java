package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentFBtextfield {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Medona");
		
		//remove ME
		
	/*for (int i = 0; i < 2; i++) {
		Thread.sleep(3000);
		firstname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(3000);
		firstname.sendKeys(Keys.BACK_SPACE);
		driver.close();*/
		
	    //remove o,a and a - med
		
for (int i = 0; i < 3; i++) {
	Thread.sleep(3000);
	firstname.sendKeys(Keys.BACK_SPACE);
}		
	}
		
	}


