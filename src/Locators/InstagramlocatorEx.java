package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramlocatorEx {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//synchronization_Implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("priyal");
		//Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		//Thread.sleep(2000);
		driver.close();
		
		
	}

}
