package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogintest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //1st pom class
	    klp1 login1=new klp1(driver);
	    login1.enterUN();
	    login1.enterPWD();
	    login1.clickLOGINBTN();
	    
	    //2nd pom class
	    klp2 login2=new klp2(driver);
	    login2.enterPIN();
	    login2.clickcntBtn();
	    
	    //3rd class
	    khp hm=new khp(driver);
	    hm.verifyuserID();
	    driver.close();
	}
	}