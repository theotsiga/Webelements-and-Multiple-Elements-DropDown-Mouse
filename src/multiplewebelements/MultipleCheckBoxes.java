package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxes {


	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("file:///C:/Users/romse/Desktop/HTML/MultipleElements.htmll"); 
			driver.manage().window().maximize();
			
			List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(checkbox.size());
			
			//click all check boxes 
			
			/*for (int i = 0; i < checkbox.size(); i++) {
				Thread.sleep(1000);
				checkbox.get(i).click();*/
			
			/// alternate check boxes
			
			/*for (int i = 1; i < checkbox.size(); i+=2) {
				Thread.sleep(1000);
				checkbox.get(i).click();*/
			
			////alternate in reverse order
			
			for (int i=checkbox.size()-2; i>=0; i-=2) {
				
			}
				Thread.sleep(1000);
				//checkbox.get(i).click();  ////// didnt work 
			}
			
			
}
			
	


