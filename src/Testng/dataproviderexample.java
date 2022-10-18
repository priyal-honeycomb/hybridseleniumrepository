package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderexample {
	@DataProvider
	public Object getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0] = "123678678876";
		obj[0][1] = "667586576576";
		
		obj[1][0] = "admin";
		obj[1][1] = "manager";
		
		obj[2][0] = "qayug176567";
		obj[2][1] = "uguyb676576";
		return obj;
	}

	@Test(dataProvider = "getData")
	public void tcl(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		Thread.sleep(8000);
		driver.close();
	}
}
