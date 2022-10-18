package NIST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://scm.hcshub.in/login");
		driver.findElement(By.xpath("//select[contains(@class,'form')]")).click();
		
		
	}

}
