package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomexample {

	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public pomexample(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	public void password(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}

}

