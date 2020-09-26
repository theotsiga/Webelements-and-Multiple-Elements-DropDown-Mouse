package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentActiTime {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]//div[@class='menu_icon']")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		
		WebElement Act =   driver.findElement(By.xpath("//select[contains(@name,'active')]"));
		Select A = new Select(Act);
		System.out.println(A.isMultiple());
		A.selectByVisibleText("archived");
		
	}
	

}
