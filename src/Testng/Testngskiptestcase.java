package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngskiptestcase {
	
	@Test(invocationCount = 4)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority = -1,invocationCount = 2,enabled=false)
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	@Test(priority = 1)
	public void chats()
	{
		Reporter.log("chats",true);
	}
		

}
