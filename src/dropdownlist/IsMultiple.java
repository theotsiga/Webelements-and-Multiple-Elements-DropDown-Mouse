package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/romse/Desktop/HTML/DropDownList.html"); ///can change it in html folder to single or multiple
		driver.manage().window().maximize();
		
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@name='employees']"));
		Select multi = new Select(dropdownlist);
		System.out.println(multi.isMultiple());
		
	}

}
