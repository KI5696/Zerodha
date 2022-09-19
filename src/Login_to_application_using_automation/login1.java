package Login_to_application_using_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login1 {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		//open the application
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("Pawar25kiran@gmial.com");
	    driver.findElement(By.id("pass")).sendKeys("$Pune12345$");
	    driver.findElement(By.name("login")).click();
	    
	}
	}

