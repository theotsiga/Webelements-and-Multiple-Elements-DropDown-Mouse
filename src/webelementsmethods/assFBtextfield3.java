package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assFBtextfield3 {

	public static void main(String[] args) {      

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("medona");
		
		// lower to upper case
		
		/*String x=firstname.getAttribute("value");
		x=x.toUpperCase();
		firstname.clear();
		firstname.sendKeys(x);*/
		
		// upper to lower 
		
		String x=firstname.getAttribute("value");
		x=x.toLowerCase();
		firstname.clear();
		firstname.sendKeys(x);

		
		/// space in between 
		
		/*String x=firstname.getAttribute("value");
		   for(int i=0;  i<x.length();  i=i+2) {
		firstname.sendKeys(Keys.ARROW_LEFT);
		firstname.sendKeys(" ");

		firstname.sendKeys(Keys.ARROW_LEFT);
		x=firstname.getAttribute("value");*/
		
		}
	}


