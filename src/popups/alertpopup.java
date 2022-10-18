package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement ele = driver.findElement(By.id("course"));
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			
			driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			//popup
			
			//incomplete , complete it 29sep2022 notes
			Alert b = driver.switchTo().alert();
			System.out.println(b.getText());
			Thread.sleep(2000);
			b.accept();
			//b.dismiss();
	}

}
