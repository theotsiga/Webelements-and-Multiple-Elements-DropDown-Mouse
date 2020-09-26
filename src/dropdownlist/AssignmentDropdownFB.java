package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropdownFB {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/r.php");
			driver.manage().window().maximize();
			
			//driver.findElement(By.xpath("//input[@id='u_0_5']")).click(); ///// radio button male 
			
			//driver.findElement(By.name("birthday_day")).click();
			
			WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
			Select sel = new Select(Day);
			//sel.selectByValue("14");
			sel.selectByIndex(14);
			WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
			Select M = new Select(Month);
			M.selectByValue("3");
			
			WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
			Select Y = new Select(Year);
			Y.selectByValue("1984");
			
			///experiments below 
			System.out.println(sel.isMultiple());
			System.out.println(M.isMultiple());
			System.out.println(Y.isMultiple());
		
			WebElement firstselected = sel.getFirstSelectedOption();
			System.out.println(firstselected.getText());
			
			List<WebElement> selectedoptions = sel.getAllSelectedOptions();
			System.out.println(selectedoptions.size());
			for (int i = 0; i < selectedoptions.size(); i++) {
				
				System.out.println(selectedoptions.get(i).getText());
	}

}
}