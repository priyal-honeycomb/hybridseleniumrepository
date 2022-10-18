package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://luxire.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement ele = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
			
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			
			//use xpath best solution
			driver.findElement(By.partialLinkText("Chino")).click();
			//driver.findElement(By.xpath("(//div[@class='megaLinkImage'])[1]")).click();
			//driver.close();
	}

}
