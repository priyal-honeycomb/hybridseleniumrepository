package navigationAPI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");

//navigate

driver.navigate().to("https://www.flipkart.com/");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//back
//Thread.sleep(3000);
driver.navigate().back();

//Thread.sleep(3000);
driver.navigate().forward();

//refresh
//Thread.sleep(3000);
driver.navigate().refresh();
		
	}

}
