package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.id("twotabsearchtextbox"));
		
		Point loc = button.getLocation();
		int x = loc.getX();
		System.out.println(x+"x co-ordinates");
		int y = loc.getY();
		System.out.println(y+"y co-ordinates");
		driver.close();
		

	}

}
