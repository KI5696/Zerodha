package using_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\KIRAN PAWAR\\\\\\\\Desktop\\\\\\\\sele\\\\\\\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //use css selector(choice the mobile)
	    driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys("mobiles under 20000");
	    //click on search button
	    
	}
	}

