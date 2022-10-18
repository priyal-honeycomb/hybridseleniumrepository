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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_Rightclick_contextmenu_amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//parent window
		String parent = driver.getWindowHandle();
		
		WebElement robo = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.contextClick(robo).perform();
		
		//Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	//	r.keyPress(KeyEvent.VK_ENTER);
		
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		//important-->switch to new window
//two times above code to switch to new tab and comment above 3 lines code
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//switch to new child window
		//Thread.sleep(2000);	
		Set<String> child = driver.getWindowHandles();
			
			for(String b:child)
			{
				driver.switchTo().window(b);
			}	
		
			//working code
			
	}

}
