package ROBOT;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    //typecast java execuiter
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,2000);");
	    Thread.sleep(3000);
	    jse.executeScript("window.scrollBy(0,2000);");
	}
}
