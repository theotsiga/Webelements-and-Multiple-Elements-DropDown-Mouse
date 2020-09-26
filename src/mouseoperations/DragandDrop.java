package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target2= driver.findElement(By.xpath("//div[@id='box107']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(source2, target2).perform();
		
		/*WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();*/
		
	}

}
