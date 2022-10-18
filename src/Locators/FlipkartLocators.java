package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Implicit Snchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[contains(@class,'VJZDxU')])[1]")).sendKeys("7021019848");
		driver.findElement(By.xpath("(//input[contains(@class,'3mctL')])[1]")).sendKeys("88des.priyal$");
		driver.findElement(By.xpath("(//button[contains(@class,'3AWRsL')])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.contains("Online Shopping Site"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		Thread.sleep(3000);
		driver.close();
	}

}
