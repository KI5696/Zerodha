package TestNG_Advantages;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equal {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="Anky";
		String actR="Anky";
		Assert.assertNotEquals(expR,actR);
	}
	}