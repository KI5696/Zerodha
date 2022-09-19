package TestNG_Advantages;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class False {
	@Test
	public void TC4() {
		Reporter.log("running TC4",true);
		boolean actR=false;
		Assert.assertFalse(actR);
}
}