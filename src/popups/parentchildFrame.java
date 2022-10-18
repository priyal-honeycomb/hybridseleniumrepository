package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class parentchildFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("userName")).sendKeys("8866379023");
		driver.findElement(By.id("checkUser")).click();
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement searchtb = driver.findElement(By.id("inputValEnter"));
		searchtb.sendKeys("frame");
		
		Thread.sleep(2000);
		
		List<WebElement> element = driver.findElements(By.xpath("(//a[@class='subdiv structured searchKeyWord'])[1]"));
		
	
	//count of the options
	System.out.println(element.size());
	
	//print the text
	for(WebElement b:element)
	{
		System.out.println(b.getText());
	}
	Thread.sleep(2000);
	driver.close();
	}

}
