package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.name("q"));
		if(searchtb.isDisplayed())
		{
			System.out.println("Pass:element is displayed");
			searchtb.sendKeys("Chimneys");
		}
		else
		{
			System.out.println("Fail:element is not displayed");
		}
		//Thread.sleep(10000);
		//driver.close();
	}

}
