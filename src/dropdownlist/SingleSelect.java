package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/romse/Desktop/HTML/DropDownList.html");
		driver.manage().window().maximize();
		
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel = new Select(dropdownlist);
		sel.selectByVisibleText("Purva");
		//sel.selectByValue("SH");
		//sel.selectByIndex(2);

		
	}

}
