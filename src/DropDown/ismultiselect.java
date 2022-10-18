package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		Select s = new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("199");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		
		
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(2000);
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("It is not multiple select");
		}
	}

}
