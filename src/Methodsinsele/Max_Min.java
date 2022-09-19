package Methodsinsele;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Min {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    //maximize the browser
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    //minimize the browser
	    driver.manage().window().minimize();
	    //note:boss  in sel(3 version) there is no minimize(0 but from sel(4 version) onwards it is implemented
	   	  	}
	}