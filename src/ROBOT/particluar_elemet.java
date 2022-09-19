package ROBOT;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class particluar_elemet {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KIRAN PAWAR\\Desktop\\sele\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		    driver.get("https://www.google.com/");
		    //i want to take scrnshot of particular element(inspect element store in ref variable)
		    WebElement gTitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		    File src = gTitle.getScreenshotAs(OutputType.FILE);
		    //store at destination
		    File dest=new File("C:\\\\Users\\\\KIRAN PAWAR\\\\Desktop\\\\Kiran\\\\KP JAVA\\\\ss\\Googletitle.jpg");
		    //source to destination
		    Files.copy(src, dest);
		    
		}

		}