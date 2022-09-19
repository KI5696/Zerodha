package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag {
	@Test(invocationCount=5)
	public void TC() {
		Reporter.log("running tc",true);
	}
	}