package TestNG_Program;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class multibrowser {
	@org.testng.annotations.Parameters("browsername")//annotation
	@Test
	public void TC(String browsername) {//paramerized method
			WebDriver driver=null;//runtime polymorphism
		
			if(browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
			else if(browsername.equals("Firefox")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver=new FirefoxDriver();
				
			}
			driver.get("https://kite.zerodha.com/");
			
			
	}
	}