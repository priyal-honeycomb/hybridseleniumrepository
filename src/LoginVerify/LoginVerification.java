package LoginVerify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7021019848");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("88des.priyal$");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(actualtitle.contains("Online Shopping Site"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

		
	}

}
