package popups;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameExampleNykaa {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
				
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement searchtb = driver.findElement(By.name("search-suggestions-nykaa"));
		searchtb.sendKeys("Moisturiser");
		driver.findElement(By.name("search-suggestions-nykaa")).submit();
		driver.findElement(By.xpath("//img[@alt='Neutrogena Hydro Boost Water Gel']")).click();
		
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@class='remove-product']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Yes']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
		
	//	driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.xpath("//span[text()='Start Shopping']")).click();
		
	    driver.switchTo().defaultContent();
		driver.close();
		driver.switchTo().window(parent);
		driver.close();
		
		//driver.switchTo().defaultContent();
		
	}

}
