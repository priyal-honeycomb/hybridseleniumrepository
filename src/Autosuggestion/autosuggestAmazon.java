package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		searchtb.sendKeys("seleni");
		
		Thread.sleep(3000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		//count of the options
		System.out.println(ele.size());
		
		//print the text
		for(WebElement b:ele)
		{
			System.out.println(b.getText());
		}
		
		driver.close();
	}

	

}
