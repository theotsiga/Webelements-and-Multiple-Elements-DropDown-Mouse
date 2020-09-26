package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropdownYahoo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().window().maximize();
		
		WebElement Code = driver.findElement(By.xpath("//select[@type='select']"));	
		Select C = new Select(Code);
		C.selectByValue("ZW");
		
		System.out.println(C.isMultiple());
	
		WebElement Month = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));	
		Select M = new Select(Month);
		M.selectByIndex(3);
	}

}
