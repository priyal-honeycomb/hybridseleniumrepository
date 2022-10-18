package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngexample {

	@Test
	public void demo() {
		Reporter.log("hello selenium",true);
		Reporter.log("hello java",false);
		
	}
	
}
