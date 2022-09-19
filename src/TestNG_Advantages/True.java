package TestNG_Advantages;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class True {
	@Test
	public void TC3() {
		Reporter.log("running TC3",true);
		boolean actR=true;
		Assert.assertTrue(actR);
	}
	}