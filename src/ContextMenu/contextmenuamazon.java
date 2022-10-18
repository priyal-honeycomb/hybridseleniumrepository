package ContextMenu;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextmenuamazon {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//parent window
		String parent = driver.getWindowHandle();
		
	WebElement ele	= driver.findElement(By.xpath("//a[text()=' Sell']"));
	Actions a = new Actions(driver);
	a.contextClick(ele).perform();
	
	Thread.sleep(3000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//move to new child window
	//Thread.sleep(3000);	
	Set<String> child = driver.getWindowHandles();
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}	
			//ctrl shift c
	//	driver.findElement(By.id("mytext")).sendKeys("Priyal");
	//parent child window handle, switch to
	
	}

}
