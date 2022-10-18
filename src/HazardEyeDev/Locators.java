package HazardEyeDev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://hazard.hcshub.in/login");
		//implicit synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Priyal@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Priyal@123");
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // driver.close();
        driver.findElement(By.name("otp")).sendKeys("111111");
        driver.findElement(By.xpath("//button[contains(text(),'Secure')]")).click();
        
        
	}

}
