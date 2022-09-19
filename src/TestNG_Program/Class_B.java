package TestNG_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_B {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	}