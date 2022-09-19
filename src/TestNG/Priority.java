package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 4)
	public void TC1() {
		Reporter.log("good byee",true);
	}
		@Test(priority = 3)
		public void TC2() {
			Reporter.log("iam fine ",true);
	}
		@Test(priority = 2)
		public void TC3() {
			Reporter.log("how r u",true);
	}
		@Test(enabled = false)
		public void TC4() {
			Reporter.log("hii",true);
		}
	}