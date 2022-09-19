package TestNG_Advantages;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void Tc1() {
		Reporter.log("running TC1",true); 
		Assert.fail();//verification 1
		System.out.println("I AM AFTER FAIL");//verifiaction 2 
		
	}
	@Test
	public void Tc2() {
		Reporter.log("I am from TC 2");
	}
	}