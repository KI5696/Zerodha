package Methodsinsele;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_size {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\KIRAN PAWAR\\\\\\\\Desktop\\\\\\\\sele\\\\\\\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    //set size of browser
//	    Dimension d=new Dimension(100,200);
//	    driver.manage().window().setSize(d);
	    
	    
	    //set the position of browser
	    Point p=new Point(300,400);
	    driver.manage().window().setPosition(p);
	}
	}