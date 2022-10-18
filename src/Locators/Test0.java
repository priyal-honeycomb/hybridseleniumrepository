package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		//driver.findElement(By.name("email")).sendKeys("manager");
		
		//driver.findElement(By.id("pass")).sendKeys("padmin");
		driver.findElement(By.name("pass")).sendKeys("pmanager");
		
		driver.findElement(By.id("loginbutton")).click();
	//	driver.findElement(By.name("login")).click();

	}

}
