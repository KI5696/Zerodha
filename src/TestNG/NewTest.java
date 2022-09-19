package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TC() {
	  Reporter.log("hiiii",true);
  }
}
