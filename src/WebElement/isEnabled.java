package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement ele = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		if(ele.isEnabled())
		{
			System.out.println("pass: button is enabled");
			ele.click();
		}
		else
		{
			System.out.println("fail: button is not enabled");
		}
		
	//	Thread.sleep(10000);
		//driver.close();

	}

}
