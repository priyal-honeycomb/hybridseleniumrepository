package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		if(checkbox.isSelected())
		{
			System.out.println("Pass:element is selected");
			checkbox.click();
		}
		else
		{
			System.out.println("Fail:element is not selected");
		}
		Thread.sleep(10000);
		driver.close();
	}

}
