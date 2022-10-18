package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationImplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
	//Implicit Waiting Synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("username")).sendKeys("priyal");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		//driver.close();
		
	}

}
