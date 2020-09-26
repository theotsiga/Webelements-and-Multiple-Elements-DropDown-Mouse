package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/romse/Desktop/HTML/DropDownList.html");
		driver.manage().window().maximize();
		
		WebElement dropdownlist = driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel = new Select(dropdownlist);
		List<WebElement> alloptions = sel.getOptions();
		System.out.println(alloptions.size());
		for (int i = 0; i < alloptions.size(); i++) {
			System.out.println(alloptions.get(i).getText());
			
		}
		
	}

}
