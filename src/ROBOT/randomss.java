package ROBOT;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class randomss {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    String random = RandomString.make();
	    //typecast takesscreenshot interface
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    //use getscreenshotAs()
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    //we have to store screenshit at particular dwstinTION create object of file class
	    File dest=new File("C:\\Users\\KIRAN PAWAR\\Desktop\\Kiran\\KP JAVA\\ss\\"+random+".jpg");
	    //u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
	    Files.copy(src, dest);
	    
	}
	}

