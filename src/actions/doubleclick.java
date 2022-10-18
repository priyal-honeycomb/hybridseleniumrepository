package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			WebElement ele = driver.findElement(By.id("course"));
			//mouse hover code
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			
			//use xpath best solution
			//doubleclick code
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
			
			WebElement ele1 = driver.findElement(By.id("add"));
			
			a.doubleClick(ele1).perform();
	}

}
